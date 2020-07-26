package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.button) Button btn1;
    @BindView(R.id.button2) Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public void onClickbtn(View v){
        switch (v.getId()){
            case R.id.button:
                Intent intent = new Intent(this, Calculator.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(this, ChangeImage.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(this, ChangeImage2.class);
                startActivity(intent3);
                break;
            case R.id.button4:
                Intent intent4 = new Intent(this, Timer.class);
                startActivity(intent4);
                break;
            case R.id.button5:
                Intent intent5 = new Intent(this, MyCalendar.class);
                startActivity(intent5);
                break;
            case R.id.button6:
                Intent intent6 = new Intent(this, RatingStar.class);
                startActivity(intent6);
                break;
            case R.id.button7:
                Intent intent7 = new Intent(this, LifeCycle.class);
                startActivity(intent7);
                break;
            case R.id.button8:
                Intent intent8 = new Intent(this, MyListView.class);
                startActivity(intent8);
                break;
            case R.id.button9:
                Intent intent9 = new Intent(this, CustomListView.class);
                startActivity(intent9);
                break;
            case R.id.button10:
                Intent intent10 = new Intent(this, PhoneBook.class);
                startActivity(intent10);
                break;
            case R.id.button11:
                Intent intent11 = new Intent(this, BottomNavigation.class);
                startActivity(intent11);
                break;
        }
    }



}
