package com.example.mypegasus.learnbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MyReceiver extends BroadcastReceiver {

    public static final String ACTION = "com.example.mypegasus.learnbroadcastreceiver.intent.action.MyReceiver";

    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
//        throw new UnsupportedOperationException("Not yet implemented");
        System.out.println("MyReceiver 接收到了消息：" + intent.getStringExtra("data"));
        Bundle bundle = new Bundle();
        bundle.putString("data", "hello world!");
        bundle.putInt("age", 2);
        setResultExtras(bundle);
        //abortBroadcast();//有序广播（ordered）下可以终止向下一个继续传播
    }
}
