package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
Intent intent;
Button tv;
Button Stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tv= (Button) findViewById(R.id.song);
       Stop=(Button)findViewById(R.id.stop);
       Stop.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               stopService(intent);

           }
       });
        intent=new Intent(this, Services.class);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startService(intent);
            }
        });
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        stopService(intent);
        super.onPause();
    }
}
