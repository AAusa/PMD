package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RadioGroup miGrupo = (RadioGroup) findViewById(R.id.grupoRadio);
        TextView tv = (TextView) findViewById(R.id.textView);

        miGrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton rb = (RadioButton) findViewById(checkedId);
                String nuevoTexto = "Pulsado: " + rb.getText().toString();
                tv.setText(nuevoTexto);
                /*
                String texto = null;
                switch(checkedId) {
                    case 2131231203:
                        texto = "Lunes";
                        break;
                    case 2131231204:
                        texto = "Martes";
                        break;
                    case 2131231205:
                        texto = "Miercoles";
                        break;
                    case 2131231202:
                        texto = "Jueves";
                        break;
                    case 2131231208:
                        texto = "Viernes";
                        break;
                    case 2131231206:
                        texto = "Sabado";
                        break;
                    case 2131231200:
                        texto = "Domingo";
                        break;
                }
                tv.setText("PULSADO: " + texto);
                */
            }
        });
    }
}