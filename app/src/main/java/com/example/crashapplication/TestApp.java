package com.example.crashapplication;

import android.app.Application;

/**
 * @author ZhongXinyu
 * @作用
 */

public class TestApp extends Application {
    private static TestApp sInstence;
    @Override
    public void onCreate() {
        super.onCreate();
        sInstence = this;
        //为线程设置异常处理器
        CrashHandler crashHandler = CrashHandler.getINSTANCE();
        crashHandler.init(this);
    }

    public static TestApp getInstance(){
        return sInstence;
    }
}
