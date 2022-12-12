package com.example.intentimplicito1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView texto = (TextView) findViewById(R.id.texto);
        Intent A2 = new Intent();
        Bundle b = correo.getExtras();
    }
}