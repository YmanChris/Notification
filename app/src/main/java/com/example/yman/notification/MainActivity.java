package com.example.yman.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        bt = (Button) findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                /*Notification notification = new Notification(R.mipmap.ic_launcher,"This is ticker text", System.currentTimeMillis());
                notification.setLatestEventInfo(this,"title","content",null);
                manager.notify(1,notification);*/
                Notification.Builder builder = new Notification.Builder(MainActivity.this);
                builder.setContentTitle("title");
                builder.setContentText("content");
                builder.setSmallIcon(R.mipmap.ic_launcher);
                Notification notification = builder.getNotification();
                manager.notify(R.mipmap.ic_launcher, notification);
            }
        });
    }
}
