package com.example.android1.firebasechatapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyFirebaseInstanceIdService extends Service {
    public MyFirebaseInstanceIdService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
