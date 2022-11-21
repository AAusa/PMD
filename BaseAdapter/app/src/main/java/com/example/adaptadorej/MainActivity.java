package com.example.adaptadorej;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 *
 */
public class MainActivity extends AppCompatActivity {
    ArrayList<Datos> datos = new ArrayList<Datos>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datos.add(new Datos(R.drawable.koala2, "Koala", "Animal tranquilo"));
        datos.add(
                new Datos(R.drawable.lagarto2,"Lagarto", "Reptil solitario"));
        datos.add(new Datos(
                R.drawable.leon2,"Leon", "Animal feroz"));
        datos.add(new Datos(R.drawable.mosca2,"Mosca", "Insecto pequeño"));

        ListView listado = (ListView) findViewById(R.id.miLista);
        Adaptador miAdaptador = new Adaptador(this, datos);
        listado.setAdapter(miAdaptador);
        View miCabecera = getLayoutInflater().inflate(R.layout.cabecera, null);
        listado.addHeaderView(miCabecera);


        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adaptador, View v, int position, long id){
                String seleccionado = ((Datos) adaptador.getItemAtPosition(position)).getTitulo();
                TextView texto = (TextView) findViewById(R.id.texto);
                texto.setText(seleccionado);
            }
        });

    }


}