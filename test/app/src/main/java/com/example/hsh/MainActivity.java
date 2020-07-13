package com.example.hsh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnTest = null;
    TextView TvTest= null;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTest = (Button) findViewById(R.id.button);
        TvTest = (TextView) findViewById(R.id.textView);
        btnTest.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "화면 전환", Toast.LENGTH_SHORT).show();
//                if(TvTest.getText().toString().equals("before"))
//                    TvTest.setText("after");
//                else
//                    TvTest.setText("before");
//
                Intent intent = new Intent(context, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
