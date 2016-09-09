package com.psw.ultrasimplenoti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewMessageNotification.notify(getApplicationContext(), "too hight to get it right", 1);
    }
}
