package com.example.listas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv = (TextView) findViewById(R.id.textView2);
        GridView grid = (GridView) findViewById(R.id.miGrid);
        final String[] paises = new String[] {"España", "Francia", "Portugal", "Belgica", "EEUU", "Venezuela", "Colombia", "Argentina", "Brasil", "Bulgaria"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
        grid.setAdapter(adaptador);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String nuevoTexto = "Pulsado: " + paises[i];
                tv.setText(nuevoTexto);

            }
        });
    }
}