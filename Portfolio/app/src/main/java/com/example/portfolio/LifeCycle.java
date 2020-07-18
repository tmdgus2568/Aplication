package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifeCycle extends AppCompatActivity {
    private final String TAG = "디버그";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d(TAG, "----------------------------Create----------------------------");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "----------------------------Start----------------------------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "----------------------------Resume----------------------------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "----------------------------Pause----------------------------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "----------------------------Stop----------------------------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "----------------------------Destroy----------------------------");
    }
}
