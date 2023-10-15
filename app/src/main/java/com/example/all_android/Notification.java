package com.example.all_android;

import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.content.res.ResourcesCompat;

public class Notification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        Drawable drawable = ResourcesCompat.getDrawable(getResources(),R.drawable.calculator,null);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        Bitmap largeIcon = bitmapDrawable.getBitmap();


        //notification is a system service
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        android.app.Notification notification = new android.app.Notification.Builder(this)
                .setLargeIcon(largeIcon)
                .setSmallIcon(R.drawable.calculator)
                .setContentText("New Message")
                .setSubText("Message of Viral")
                .build();

    }
}