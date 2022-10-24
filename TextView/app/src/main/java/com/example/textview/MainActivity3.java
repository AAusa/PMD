package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView miTexto = (TextView) findViewById(R.id.textView3);
        miTexto.append("\nTexto añadido con Append desde java");
        miTexto.setTextColor(Color.BLUE);
        miTexto.setTextSize(20);
        miTexto.setTypeface(miTexto.getTypeface(), Typeface.ITALIC);
        //https://stackoverflow.com/questions/37904739/html-fromhtml-deprecated-in-android-n

    }
}