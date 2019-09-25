package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class reciever extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if(action.equals(Intent.ACTION_POWER_CONNECTED))
        {
            // Do something when power connected
            Toast.makeText(context, "Charging Connected", Toast.LENGTH_SHORT).show();
        }
        else if(action.equals(Intent.ACTION_POWER_DISCONNECTED))
        {
            // Do something when power disconnected
            Toast.makeText(context, "Charging Disconnected", Toast.LENGTH_SHORT).show();
        }
    }
}
