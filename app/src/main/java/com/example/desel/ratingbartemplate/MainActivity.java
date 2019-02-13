package com.example.desel.ratingbartemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    // DECLARING VARIABLES
    RatingBar rb;
    TextView tvValue;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TYPE CASTING
        rb = findViewById(R.id.rb);
        tvValue = findViewById(R.id.tvValue);

        // WORK
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener()
        {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser)
            {
                tvValue.setText("This value is " + rating);
            }
        });
    }
}
