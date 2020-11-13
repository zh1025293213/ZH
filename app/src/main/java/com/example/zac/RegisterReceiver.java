package com.example.zac;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class RegisterReceiver extends BroadcastReceiver {
//      public void onReceive(Context context,"get change");


    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("MainActivity","get change");
    }
}
