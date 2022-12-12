package com.example.ejercicio1ausaberrialvaro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.b1);
        Button b2 = (Button) findViewById(R.id.b2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.b1:
                TextView titulo = (TextView) findViewById(R.id.titulo);
                titulo.setTextColor(getResources().getColor(R.color.purple_500));
                break;
            case R.id.b2:
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
                break;
        }
    }
}