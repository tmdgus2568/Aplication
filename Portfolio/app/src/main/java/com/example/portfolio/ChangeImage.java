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

public class ChangeImage extends AppCompatActivity {
    @BindView(R.id.button49)
    Button change;
    @BindView(R.id.imageView)
    ImageView img1;
    @BindView(R.id.imageView2)
    ImageView img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_image);
        ButterKnife.bind(this);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img2.getVisibility() == View.VISIBLE){
                    img2.setVisibility(View.INVISIBLE);
                }
                else{
                    img2.setVisibility(View.VISIBLE);
                }
            }
        });
    }


}
