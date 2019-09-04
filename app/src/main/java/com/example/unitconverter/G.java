package com.example.unitconverter;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

public class G extends Application {
    public static Context context;
    public static Activity currentActivity=null;

    @Override
    public void onCreate() {
        context=getApplicationContext();
        super.onCreate();
    }
}
