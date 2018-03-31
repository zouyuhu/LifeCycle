package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private  final   String TAG ="mainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:123 ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: 123");
    }
@Override
protected void onPause() {
    super.onPause();
    Log.d(TAG, "onPause: 123");
}

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume:123 ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: 123");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy:123 ");
    }
}


