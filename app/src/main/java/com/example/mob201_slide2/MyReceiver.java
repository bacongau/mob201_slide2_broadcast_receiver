package com.example.mob201_slide2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        CharSequence iData = intent.getCharSequenceExtra("msg");
        Toast.makeText(context,"Tutlane Received Message: "+iData,Toast.LENGTH_LONG).show();
    }
}
