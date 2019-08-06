package com.example.demoreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BatteryReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast myToast= Toast.makeText(context, "LOW", Toast.LENGTH_LONG);
        myToast.show();
    }
}
