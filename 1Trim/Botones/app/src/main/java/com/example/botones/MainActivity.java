package com.example.botones;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private boolean presionar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("EJEMPLO", "Estoy en onCreate");
        presionar = false;
    }

    public void presionarA2(View view) {
        Intent A2 = new Intent(this, Activity2.class);
        Button boton = (Button) view;
        if(presionar) {
            startActivity(A2);
            Log.i("EJEMPLO", "Estoy en A2");
        }
        presionar = !presionar;

    }

    public void presionarA3(View view) {
        Intent A3 = new Intent(this, Activity3.class);
        Button boton = (Button) view;
        if(presionar) {
            startActivity(A3);
            Log.i("EJEMPLO", "Estoy en A3");
        }
        presionar = !presionar;
    }
}