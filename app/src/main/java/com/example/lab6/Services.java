package com.example.lab6;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;
import androidx.annotation.Nullable;

import java.io.IOException;
public class Services extends Service {
    MediaPlayer media;
    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
Toast.makeText(this,"Hello",Toast.LENGTH_SHORT).show();
        media=MediaPlayer.create(this, R.raw.songs);
        try {
            media.prepare();
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        media.start();
        // TODO Auto-generated method stub
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        media.release();
        super.onDestroy();
    }
}
