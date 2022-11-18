package com.example.adaptadorej;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Datos[] datos = new Datos[]{
            new Datos("Sup1", "Inf1"),
            new Datos("Sup2", "Inf2"),
            new Datos("Sup3", "Inf3"),
            new Datos("Sup4", "Inf4"),
            new Datos("Sup5", "Inf5"),
            new Datos("Sup6", "Inf6"),
            new Datos("Sup7", "Inf7"),
            new Datos("Sup8", "Inf8")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listado = (ListView) findViewById(R.id.miLista);
        Adaptador miAdaptador = new Adaptador(this, datos);
        listado.setAdapter(miAdaptador);
        View miCabecera = getLayoutInflater().inflate(R.layout.cabecera, null);
        listado.addHeaderView(miCabecera);
        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adaptador, View v, int position, long id){
                String seleccionado = ((Datos) adaptador.getItemAtPosition(position)).getTexto1()+"\n";
                seleccionado += ((Datos) adaptador.getItemAtPosition(position)).getTexto2();
                TextView texto = (TextView) findViewById(R.id.texto);
                texto.setText(seleccionado);
            }
        });
    }


}