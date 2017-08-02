package com.example.administrator.zuoye0801;

import android.app.Application;

import org.xutils.x;


/**
 * 姓名：洪翠影
 * 时间：2017/8/1.20:41
 * 类作用：
 * 思路：
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);
    }
}
