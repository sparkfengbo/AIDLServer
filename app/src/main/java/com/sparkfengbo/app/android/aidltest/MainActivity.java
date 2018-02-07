package com.sparkfengbo.app.android.aidltest;

import com.sparkfengbo.app.MyService;
import com.sparkfengbo.app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(this, MyService.class));
    }
}
