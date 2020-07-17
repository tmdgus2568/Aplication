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
    @BindView(R.id.textView9)
    TextView txt36;
    @BindView(R.id.textView10)
    TextView txt37;
    @BindView(R.id.textView12)
    TextView txt38;
    @BindView(R.id.textView13)
    TextView txt39;
    @BindView(R.id.textView55)
    TextView txt40;
    @BindView(R.id.textView56)
    TextView txt41;
    @BindView(R.id.textView57)
    TextView txt42;


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
                txt24, txt25, txt26, txt27, txt28, txt29, txt30, txt31,
                txt32, txt33, txt34, txt35, txt36, txt37, txt38, txt39, txt40, txt41, txt42};
        int[] month_day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


//        weekday_current = weekdayFormat.format(currentTime);
//        year_current = yearFormat.format(currentTime);
//        month_current = monthFormat.format(currentTime);
//        day_current = dayFormat.format(currentTime);

        weekday_current = "Sun";
        year_current = yearFormat.format(currentTime);
        month_current = "5";
        day_current = "31";

        setDays();

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Integer.parseInt(month_current) - 1) == 0){
                    month_current = "12";
                    year_current = Integer.toString(Integer.parseInt(year_current) - 1);
                }
                else month_current = Integer.toString(Integer.parseInt(month_current) - 1);


                for(int i=1;i<=7;i++){
                    if((Cal[i].getText()).equals("1")){
                        int k = i - 1;
                        if (k == 0) k = 7;
                        day_current = Integer.toString(month_day[Integer.parseInt(month_current)]);
                        if(k == 1) weekday_current = "Sun";
                        else if(k==2) weekday_current = "Mon";
                        else if(k==3) weekday_current = "Tue";
                        else if(k==4) weekday_current = "Wed";
                        else if(k==5) weekday_current = "Thu";
                        else if(k==6) weekday_current = "Fri";
                        else weekday_current = "Sat";


                        setDays();


                        break;
                    }

                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int this_month = Integer.parseInt(month_current);
                if((Integer.parseInt(month_current) + 1) == 13){
                    month_current = "1";
                    year_current = Integer.toString(Integer.parseInt(year_current) + 1);
                }
                else month_current = Integer.toString(Integer.parseInt(month_current) + 1);
                for(int i=28;i<=42;i++){

                    if((Cal[i].getText()).equals(Integer.toString(month_day[this_month]))){
                        System.out.println(i);
                        int k = i + 1;
                        k = k%7;
                        day_current = Integer.toString(1);
                        if(k == 1) weekday_current = "Sun";
                        else if(k==2) weekday_current = "Mon";
                        else if(k==3) weekday_current = "Tue";
                        else if(k==4) weekday_current = "Wed";
                        else if(k==5) weekday_current = "Thu";
                        else if(k==6) weekday_current = "Fri";
                        else weekday_current = "Sat";
                        System.out.println(month_current);
                        System.out.println(day_current);
                        System.out.println(weekday_current);

                        setDays();


                        break;
                    }

                }
            }
        });

    }

    public void setDays(){
        TextView[] Cal = {null, txt1, txt2, txt3, txt4, txt5, txt6, txt7,
                txt8, txt9, txt10, txt11, txt12, txt13, txt14, txt15,
                txt16, txt17, txt18, txt19, txt20, txt21, txt22, txt23,
                txt24, txt25, txt26, txt27, txt28, txt29, txt30, txt31,
                txt32, txt33, txt34, txt35, txt36, txt37, txt38, txt39, txt40, txt41, txt42};
        int[] month_day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        year_txt.setText(year_current);
        month_txt.setText(month_current);
        int d = Integer.parseInt(day_current) % 7;
        int k ;

        for(int i=1;i<=42;i++)
            Cal[i].setText("");


        switch (weekday_current){
            case "Sun" :
                k = 1-d+1;
                if(k < 0) k = k+7;
                else if (k > 7) k = k-7;
                for(int i=1; i<=month_day[Integer.parseInt(month_current)]; i++){
                    Cal[k-1+i].setText(Integer.toString(i));
                }
                break;
            case "Mon" :
                k = 2-d+1;
                if(k < 0) k = k+7;
                else if (k > 7) k = k-7;
                for(int i=1; i<=month_day[Integer.parseInt(month_current)]; i++){
                    Cal[k-1+i].setText(Integer.toString(i));
                }
                break;
            case "Tue" :
                k = 3-d+1;
                if(k < 0) k = k+7;
                else if (k > 7) k = k-7;
                for(int i=1; i<=month_day[Integer.parseInt(month_current)]; i++){
                    Cal[k-1+i].setText(Integer.toString(i));
                }
                break;
            case "Wed" :
                k = 4-d+1;
                if(k < 0) k = k+7;
                else if (k > 7) k = k-7;
                for(int i=1; i<=month_day[Integer.parseInt(month_current)]; i++){
                    Cal[k-1+i].setText(Integer.toString(i));
                }
                break;
            case "Thu" :
                k = 5-d+1;
                if(k < 0) k = k+7;
                else if (k > 7) k = k-7;
                for(int i=1; i<=month_day[Integer.parseInt(month_current)]; i++){
                    Cal[k-1+i].setText(Integer.toString(i));
                }
                break;
            case "Fri" :
                k = 6-d+1;
                if(k < 0) k = k+7;
                else if (k > 7) k = k-7;
                for(int i=1; i<=month_day[Integer.parseInt(month_current)]; i++){
                    Cal[k-1+i].setText(Integer.toString(i));
                }
                break;
            case "Sat" :
                k = 7-d+1;
                if(k < 0) k = k+7;
                else if (k > 7) k = k-7;
                for(int i=1; i<=month_day[Integer.parseInt(month_current)]; i++){
                    Cal[k-1+i].setText(Integer.toString(i));
                }
                break;
        }

    }


}
