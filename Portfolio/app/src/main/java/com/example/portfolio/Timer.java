package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Timer extends AppCompatActivity {
    int count = 0;
    Context context = this;
    @BindView(R.id.textView)
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        ButterKnife.bind(this);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) { // 현재 UI 스레드가 아니기 때문에 메시지 큐에 Runnable을 등록 함
                    count++;
//                    runOnUiThread(new Runnable() {
//                        public void run() { // 메시지 큐에 저장될 메시지의 내용
//
//                        }
//                    });
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Message msg = mHandler.obtainMessage();
                    msg.arg1 = count;
                    mHandler.sendMessage(msg);
                }
                finish();
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        }).start();
    }
    Handler mHandler = new Handler(){
        public void handleMessage(Message msg){
            txt.setText(""+msg.arg1);

        }
    };
}
