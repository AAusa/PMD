package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    RatingBar ratingBar;
    TextView rateMessage;
    String ratedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar1);
        rateMessage = (TextView) findViewById(R.id.ratingMessage);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {

                ratedValue = String.valueOf(ratingBar.getRating());
                rateMessage.setText("Rating : "
                        + ratedValue + "/5");

            }
        });
    }
}