package com.example.notilistener;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Log;

@SuppressLint("OverrideAbstract")
public class Listener extends NotificationListenerService {
    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        String packageName = sbn.getPackageName();
        Notification noti = sbn.getNotification();
        Bundle extras = noti.extras;
        String title = extras.getString(Notification.EXTRA_TITLE);
        String text = extras.getString(Notification.EXTRA_TEXT);
        String subText = extras.getString(Notification.EXTRA_SUB_TEXT);
        Log.d("asdf", packageName);
        if(title == null) {
            title = "NULL";
        }
        if(text == null) {
            text = "NULL";
        }
        if(subText == null) {
            subText = "NULL";
        }
        Log.d("asdf", title);
        Log.d("asdf", text);
        Log.d("asdf", subText);
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
        //Nothing to do
    }
}