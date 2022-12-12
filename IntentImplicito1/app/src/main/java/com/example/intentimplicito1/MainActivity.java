package com.example.intentimplicito1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bA2 = (Button) findViewById(R.id.bA2);
        bA2.setOnClickListener(this);
    }

    public void onDestroy() {
        Log.i("ejemplo", "onDestroy");
        Intent A2 = new Intent(this, MainActivity2.class);
        String mensaje = "Hola";
        A2.putExtra(Intent.EXTRA_TEXT, mensaje);
        startActivity(A2);
        super.onDestroy();

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.bA2:
                this.onDestroy();
                break;
        }
    }
}