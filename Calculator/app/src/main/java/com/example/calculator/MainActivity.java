package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String sum = "";
    String ans = "";
    String cal = "";
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button clear;
    Button negative;
    Button percent;
    Button division;
    Button multiple;
    Button minus;
    Button plus;
    Button point;
    Button rtn;

    TextView board_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        clear = (Button) findViewById(R.id.clear);
        negative = (Button) findViewById(R.id.negative);
        percent = (Button) findViewById(R.id.percent);
        division = (Button) findViewById(R.id.division);
        multiple = (Button) findViewById(R.id.multiple);
        minus = (Button) findViewById(R.id.minus);
        plus = (Button) findViewById(R.id.plus);
        point = (Button) findViewById(R.id.point);
        rtn = (Button) findViewById(R.id.rtn);
        board_tv = (TextView) findViewById(R.id.board_tv);

    }

    public void onClickNum(View v){
        switch (v.getId()){
            case R.id.btn1:
                sum += btn1.getText();
                board_tv.setText(sum);
                break;
            case R.id.btn2:
                sum += btn2.getText();
                board_tv.setText(sum);
                break;
            case R.id.btn3:
                sum += btn3.getText();
                board_tv.setText(sum);
                break;
            case R.id.btn4:
                sum += btn4.getText();
                board_tv.setText(sum);
                break;
            case R.id.btn5:
                sum += btn5.getText();
                board_tv.setText(sum);
                break;
            case R.id.btn6:
                sum += btn6.getText();
                board_tv.setText(sum);
                break;
            case R.id.btn7:
                sum += btn7.getText();
                board_tv.setText(sum);
                break;
            case R.id.btn8:
                sum += btn8.getText();
                board_tv.setText(sum);
                break;
            case R.id.btn9:
                sum += btn9.getText();
                board_tv.setText(sum);
                break;
            case R.id.btn0:
                sum += btn0.getText();
                board_tv.setText(sum);
                break;
            case R.id.clear:
                sum = "";
                board_tv.setText("0");
                break;
            case R.id.negative:
                sum = Integer.toString(Integer.parseInt(sum) * (-1));
                board_tv.setText(sum);
                break;
//            case R.id.percent:
//                sum = Double.toString(Double.parseDouble(sum) * (0.01));
//                board_tv.setText(sum);
//                break;
            case R.id.division:
                calculation();
                cal = "/";
                sum = "";
                board_tv.setText(ans);
                break;
            case R.id.multiple:
                calculation();
                cal = "*";
                sum = "";
                board_tv.setText(ans);
                break;
            case R.id.minus:
                calculation();
                cal = "-";
                sum = "";
                board_tv.setText(ans);
                break;
            case R.id.plus:
                calculation();
                cal = "+";
                sum = "";
                board_tv.setText(ans);
                break;
//            case R.id.point:
//                sum += ".";
//                board_tv.setText(sum);
//                break;
            case R.id.rtn:
                if(ans.isEmpty())
                    break;
                else{
                    calculation();
                    cal = "";
                    sum = "";
                    board_tv.setText(ans);
                    ans = "";
                    break;
                }


        }
    }
    public void calculation(){
        if(cal.isEmpty()){
            ans = board_tv.getText().toString();
        }
        else if(sum.isEmpty());
        else{
            if(cal.equals("/"))
                ans = Integer.toString(Integer.parseInt(ans) / Integer.parseInt(sum));
            else if(cal.equals("*"))
                ans = Integer.toString(Integer.parseInt(ans) * Integer.parseInt(sum));
            else if(cal.equals("-"))
                ans = Integer.toString(Integer.parseInt(ans) - Integer.parseInt(sum));
            else if(cal.equals("+"))
                ans = Integer.toString(Integer.parseInt(ans) + Integer.parseInt(sum));
            else;
        }
    }

}
