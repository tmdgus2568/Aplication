package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChangeImage2 extends AppCompatActivity {
    @BindView(R.id.button50)
    Button change;
    @BindView(R.id.imageView3)
    ImageView img1;
    @BindView(R.id.imageView4)
    ImageView img2;
    boolean imageChange = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_image2);
        ButterKnife.bind(this);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageChange == false){
                    imageChange = true;
                    img1.setImageResource(R.drawable.img2);
                    img2.setImageResource(R.drawable.img1);
                }
                else{
                    imageChange = false;
                    img1.setImageResource(R.drawable.img1);
                    img2.setImageResource(R.drawable.img2);
                }
            }
        });
    }
}
