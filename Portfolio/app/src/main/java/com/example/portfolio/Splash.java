package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {
    int count = 0;
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 2; i++) { // 현재 UI 스레드가 아니기 때문에 메시지 큐에 Runnable을 등록 함
                    count++;
                    runOnUiThread(new Runnable() {
                        public void run() { // 메시지 큐에 저장될 메시지의 내용

                        }
                    });
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                finish();
                Intent intent = new Intent(context, Login.class);
                startActivity(intent);
            }
        }).start();
    }
}
