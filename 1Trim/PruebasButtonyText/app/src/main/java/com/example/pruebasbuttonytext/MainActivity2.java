package com.example.pruebasbuttonytext;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button miBoton1 = findViewById(R.id.button1);
        Button miBoton2 = findViewById(R.id.button2);
        miBoton1.setOnClickListener(this);
        miBoton2.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        TextView miTexto = findViewById(R.id.textoo2);
        switch(view.getId()) {
            case R.id.button1:
                miTexto.setText(R.string.textButton1);
                miTexto.setTextColor(Color.RED);
                miTexto.setTextColor(Color.GREEN);
                break;
            case R.id.button2:
                miTexto.setText(R.string.textButton2);
                miTexto.setTextColor(Color.GREEN);
                break;

        }
    }
}