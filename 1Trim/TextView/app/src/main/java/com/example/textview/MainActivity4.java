package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView miTextoo = findViewById(R.id.textView5);
        Typeface miFuente = Typeface.createFromAsset(getAssets(),"font/Umbrella.ttf");
        miTextoo.setTypeface(miFuente);
    }
}