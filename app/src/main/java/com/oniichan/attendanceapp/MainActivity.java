package com.oniichan.attendanceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callOnWake();
        //Make a minor change.
    }

    private void callOnWake(){
        //TODO call this function on wake
    }
}
