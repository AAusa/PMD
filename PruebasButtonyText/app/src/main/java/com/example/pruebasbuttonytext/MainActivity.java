package com.example.pruebasbuttonytext;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void pulsado(View view) {
        TextView miTexto = findViewById(R.id.textoo);
        miTexto.setText(R.string.textButton1);
        miTexto.setTextColor(Color.BLUE);

    }
}