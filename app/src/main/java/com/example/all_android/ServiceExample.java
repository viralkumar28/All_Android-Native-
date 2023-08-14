package com.example.all_android;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;

import static android.app.Service.START_NOT_STICKY;
import static com.example.all_android.ChannelClass.ChannelID;

public class ServiceExample extends Services {
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStart(Intent intent, int flags, int startId) {
        Intent notiIntent = new Intent(this, Services.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, notiIntent, PendingIntent.FLAG_IMMUTABLE);
        NotificationCompat.Builder notification = new NotificationCompat.Builder(this, ChannelID)
                .setContentText("Notification")
                .setContentText("Another")
                .setSmallIcon(R.drawable.calculator)
                .setContentIntent(pendingIntent);


        return START_NOT_STICKY;
    }
}