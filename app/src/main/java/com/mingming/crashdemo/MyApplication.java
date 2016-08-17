package com.mingming.crashdemo;

import android.app.Application;

/**
 * Created by mingming on 2016/8/17.
 * Created by 2016
 *
 * @ 描述
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        CrashHandler.getInstance().init(getApplicationContext());
    }
}
