package com.kingkingruan.runmusic;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by ruanjinjing on 16/5/18.
 */
public class RunApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(this);
    }
}
