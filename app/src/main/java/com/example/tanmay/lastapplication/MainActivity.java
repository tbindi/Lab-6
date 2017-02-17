package com.example.tanmay.lastapplication;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        Notification notification = new Notification.Builder(getApplicationContext())
                .setContentTitle("Main Activity")
                .setContentText(" Blah Blah")
                .setSmallIcon(R.drawable.ic_stat_name)
                .build();

        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        nm.notify(0, notification);
    }
}
