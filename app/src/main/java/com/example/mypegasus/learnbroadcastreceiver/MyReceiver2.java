package com.example.mypegasus.learnbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MyReceiver2 extends BroadcastReceiver {
    public MyReceiver2() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
//        throw new UnsupportedOperationException("Not yet implemented");
        Bundle bundle = getResultExtras(false);
        if(bundle != null) {
            System.out.println("接收到来自 MyReceiver 发来的消息：" + bundle.getString("data") + ", " + bundle.getInt("age"));
        }
        System.out.println("MyReceiver2 接收到了消息：" + intent.getIntExtra("age", 3));
    }
}
