package com.example.zac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private IntentFilter intentFilter;
    private NetworkChangReceiver networkChangReceiver;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        networkChangReceiver=new NetworkChangReceiver();
        intentFilter =new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(networkChangReceiver,intentFilter);
    }

    @Override
        protected void onDestroy() {
            super.onDestroy();
            unregisterReceiver(networkChangReceiver);
        }

    class NetworkChangReceiver extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.d("MainActivity","Network Changes!");
        }
    }
}
