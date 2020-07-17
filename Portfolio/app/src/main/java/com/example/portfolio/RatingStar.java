package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RatingStar extends AppCompatActivity {
    @BindView(R.id.ratingBar)
    RatingBar ratingBar;
    @BindView(R.id.rating_val)
    TextView ratingVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_star);
        ButterKnife.bind(this);
        ratingVal.setText("0.0" + "/" + Integer.toString(ratingBar.getNumStars()));

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                ratingVal.setText(Float.toString(rating) + "/" + Integer.toString(ratingBar.getNumStars()));
            }
        });

    }
}
