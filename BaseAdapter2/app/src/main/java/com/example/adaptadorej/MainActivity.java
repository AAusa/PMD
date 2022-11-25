package com.example.adaptadorej;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

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

        datos.add(new Datos(R.drawable.koala, "Koala", "Animal tranquilo"));
        datos.add(
                new Datos(R.drawable.lagarto,"Lagarto", "Reptil solitario"));
        datos.add(new Datos(
                R.drawable.leon,"Leon", "Animal feroz"));
        datos.add(new Datos(R.drawable.mosca,"Mosca", "Insecto pequeño"));

        ListView listado = (ListView) findViewById(R.id.miLista);
        listado.setAdapter(new Adaptador(this, R.layout.elemento, datos) {
            @Override
            public void onEntrada(Object entrada, View view) {
                TextView textoSuperiorEntrada = (TextView) view.findViewById(R.id.titulo);
                TextView textoInferiorEntrada = (TextView) view.findViewById(R.id.descripcion);
                ImageView iv = (ImageView) view.findViewById(R.id.imagen);
            }
        });
        View miCabecera = getLayoutInflater().inflate(R.layout.cabecera, null);
        listado.addHeaderView(miCabecera);
        RadioButton miRadio = (RadioButton) findViewById(R.id.rb);
        miRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView texto = (TextView) findViewById(R.id.texto);
                if(miRadio != null) {
                    miRadio.setChecked(false);
                }
                miRadio = (RadioButton) view;
                texto.setText("MARCADA UNA OPCION");
            }
        });

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