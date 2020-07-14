package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Calculator extends AppCompatActivity {

    String sum = "";
    String ans = "";
    String cal = "";
    @BindView(R.id.btn1) Button btn1;
    @BindView(R.id.btn2) Button btn2;
    @BindView(R.id.btn3) Button btn3;
    @BindView(R.id.btn4) Button btn4;
    @BindView(R.id.btn5) Button btn5;
    @BindView(R.id.btn6) Button btn6;
    @BindView(R.id.btn7) Button btn7;
    @BindView(R.id.btn8) Button btn8;
    @BindView(R.id.btn9) Button btn9;
    @BindView(R.id.btn0) Button btn0;
    @BindView(R.id.clear) Button clear;
    @BindView(R.id.negative) Button negative;
    @BindView(R.id.percent) Button percent;
    @BindView(R.id.division) Button division;
    @BindView(R.id.multiple) Button multiple;
    @BindView(R.id.plus) Button plus;
    @BindView(R.id.point) Button point;
    @BindView(R.id.rtn) Button rtn;
    @BindView(R.id.board_tv) TextView board_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ButterKnife.bind(this);
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
                if(sum.contains("."))
                    sum = Double.toString(Double.parseDouble(sum) * (-1));
                else sum = Integer.toString(Integer.parseInt(sum) * (-1));
                board_tv.setText(sum);
                break;
            case R.id.percent:
                sum = Double.toString(Double.parseDouble(sum) * (0.01));
                board_tv.setText(sum);
                break;
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
            case R.id.point:
                sum += ".";
                board_tv.setText(sum);
                break;
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
    public String doubleTOint(double d){
        if(ans.contains(".0"))
            return Integer.toString((int)d);
        else return Double.toString(d);
    }

    public void calculation(){
        if(cal.isEmpty()){
            ans = board_tv.getText().toString();
        }
        else if(sum.isEmpty());
        else{
            if(cal.equals("/")){
                ans = Double.toString(Double.parseDouble(ans) / Double.parseDouble(sum));
                ans = doubleTOint(Double.parseDouble(ans));
            }
            else if(cal.equals("*")) {
                if (ans.contains(".") || sum.contains(".")) {
                    ans = Double.toString(Double.parseDouble(ans) * Double.parseDouble(sum));
                    ans = doubleTOint(Double.parseDouble(ans));
                }
                else ans = Integer.toString(Integer.parseInt(ans) * Integer.parseInt(sum));
            }
            else if(cal.equals("-")) {
                if (ans.contains(".") || sum.contains("."))
                    ans = Double.toString(Double.parseDouble(ans) - Double.parseDouble(sum));
                else ans = Integer.toString(Integer.parseInt(ans) - Integer.parseInt(sum));
            }
            else if(cal.equals("+")) {
                if (ans.contains(".") || sum.contains("."))
                    ans = Double.toString(Double.parseDouble(ans) + Double.parseDouble(sum));
                else ans = Integer.toString(Integer.parseInt(ans) + Integer.parseInt(sum));
            }
            else;
        }
    }
}
