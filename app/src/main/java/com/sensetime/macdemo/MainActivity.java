package com.sensetime.macdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        PermissionHelper.getInstance().init(this)
//                .checkPermission(Manifest.permission.ACCESS_NETWORK_STATE,
//                        Manifest.permission.ACCESS_FINE_LOCATION,
//                        Manifest.permission.ACCESS_WIFI_STATE);
    }

    public void getMac(View view) {
        String macAddr = DeviceInfoUtils.getMacAddr();
        Log.d("qhh",">>> mac = "+ macAddr);
    }
}
