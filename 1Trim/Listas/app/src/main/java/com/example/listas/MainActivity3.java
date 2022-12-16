package com.example.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView tv = (TextView) findViewById(R.id.textView3);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final String[] paises = new String[]{"España", "Francia", "Portugal", "Belgica", "EEUU", "Venezuela", "Colombia", "Argentina", "Brasil", "Bulgaria"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
        spinner.setAdapter(adaptador);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String nuevoTexto = "Pulsado: " + paises[i];
                tv.setText(nuevoTexto);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                String nuevoTexto = "NADA pulsado";
                tv.setText(nuevoTexto);
            }
        });
    }
}