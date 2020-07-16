package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyCalendar extends AppCompatActivity {
    String weekday_current ;
    String year_current ;
    String month_current ;
    String day_current ;

    @BindView(R.id.textView2)
    TextView year_txt;
    @BindView(R.id.textView7)
    TextView month_txt;

    @BindView(R.id.textView20)
    TextView txt1;
    @BindView(R.id.textView21)
    TextView txt2;
    @BindView(R.id.textView22)
    TextView txt3;
    @BindView(R.id.textView23)
    TextView txt4;
    @BindView(R.id.textView24)
    TextView txt5;
    @BindView(R.id.textView25)
    TextView txt6;
    @BindView(R.id.textView26)
    TextView txt7;
    @BindView(R.id.textView27)
    TextView txt8;
    @BindView(R.id.textView28)
    TextView txt9;
    @BindView(R.id.textView29)
    TextView txt10;
    @BindView(R.id.textView30)
    TextView txt11;
    @BindView(R.id.textView31)
    TextView txt12;
    @BindView(R.id.textView32)
    TextView txt13;
    @BindView(R.id.textView33)
    TextView txt14;
    @BindView(R.id.textView34)
    TextView txt15;
    @BindView(R.id.textView35)
    TextView txt16;
    @BindView(R.id.textView36)
    TextView txt17;
    @BindView(R.id.textView37)
    TextView txt18;
    @BindView(R.id.textView38)
    TextView txt19;
    @BindView(R.id.textView39)
    TextView txt20;
    @BindView(R.id.textView40)
    TextView txt21;
    @BindView(R.id.textView41)
    TextView txt22;
    @BindView(R.id.textView42)
    TextView txt23;
    @BindView(R.id.textView43)
    TextView txt24;
    @BindView(R.id.textView44)
    TextView txt25;
    @BindView(R.id.textView45)
    TextView txt26;
    @BindView(R.id.textView46)
    TextView txt27;
    @BindView(R.id.textView47)
    TextView txt28;
    @BindView(R.id.textView48)
    TextView txt29;
    @BindView(R.id.textView49)
    TextView txt30;
    @BindView(R.id.textView50)
    TextView txt31;
    @BindView(R.id.textView51)
    TextView txt32;
    @BindView(R.id.textView52)
    TextView txt33;
    @BindView(R.id.textView53)
    TextView txt34;
    @BindView(R.id.textView54)
    TextView txt35;

    @BindView(R.id.imageView10)
    ImageView prev;
    @BindView(R.id.imageView11)
    ImageView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_calendar);
        ButterKnife.bind(this);
        Date currentTime = Calendar.getInstance().getTime();
        SimpleDateFormat weekdayFormat = new SimpleDateFormat("EE", Locale.getDefault());
        SimpleDateFormat dayFormat = new SimpleDateFormat("dd", Locale.getDefault());
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM", Locale.getDefault());
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy", Locale.getDefault());
        TextView[] Cal = {null, txt1, txt2, txt3, txt4, txt5, txt6, txt7,
                txt8, txt9, txt10, txt11, txt12, txt13, txt14, txt15,
                txt16, txt17, txt18, txt19, txt20, txt21, txt22, txt23,
                txt24, txt25, txt26, txt27, txt28, txt29, txt30, txt31, txt32, txt33, txt34, txt35};
        int[] month_day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        weekday_current = weekdayFormat.format(currentTime);
        year_current = yearFormat.format(currentTime);
        month_current = monthFormat.format(currentTime);
        day_current = dayFormat.format(currentTime);

//        weekday_current = "Tue";
//        year_current = yearFormat.format(currentTime);
//        month_current = "6";
//        day_current = "16";

        year_txt.setText(year_current);
        month_txt.setText(month_current);
        int d = Integer.parseInt(day_current) % 7;
        int k ;

        switch (weekday_current){
            case "Sun" :
                for(int i=1; i<=month_day[Integer.parseInt(month_current)]; i++){
                    k = 1-d+i;
                    if(k < 0) k = k + 7;
                    else Cal[1-d+i].setText(Integer.toString(i));
                }
                break;
            case "Mon" :
                for(int i=1; i<=month_day[Integer.parseInt(month_current)]; i++){
                    k = 2-d+i;
                    if(k < 0) k = k + 7;
                    else Cal[2-d+i].setText(Integer.toString(i));
                }
                break;
            case "Tue" :
                for(int i=1; i<=month_day[Integer.parseInt(month_current)]; i++){
                    k = 3-d+i;
                    if(k < 0) k = k + 7;
                    else Cal[3-d+i].setText(Integer.toString(i));
                }
                break;
            case "Wed" :
                for(int i=1; i<=month_day[Integer.parseInt(month_current)]; i++){
                    k = 4-d+i;
                    if(k < 0) k = k + 7;
                    else Cal[4-d+i].setText(Integer.toString(i));
                }
                break;
            case "Thu" :
                for(int i=1; i<=month_day[Integer.parseInt(month_current)]; i++){
                    k = 5-d+i;
                    if(k < 0) k = k + 7;
                    else Cal[5-d+i].setText(Integer.toString(i));
                }
                break;
            case "Fri" :
                for(int i=1; i<=month_day[Integer.parseInt(month_current)]; i++){
                    k = 6-d+i;
                    if(k < 0) k = k + 7;
                    else Cal[6-d+i].setText(Integer.toString(i));

                }
                break;
            case "Sat" :
                for(int i=1; i<=month_day[Integer.parseInt(month_current)]; i++){
                    k = 7-d+i;
                    if(k < 0) k = k + 7;
                    else Cal[7-d+i].setText(Integer.toString(i));
                }
                break;
       }

    }


}
