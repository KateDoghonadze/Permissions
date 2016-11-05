package com.example.mac13.permissions;

import android.app.Application;

/**
 * Created by mac13 on 05.11.16.
 */
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Settings.initialize(this);
    }
}
