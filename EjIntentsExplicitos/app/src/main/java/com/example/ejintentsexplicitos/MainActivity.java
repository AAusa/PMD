package com.example.ejintentsexplicitos;

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
        Button A2 = (Button) findViewById(R.id.A2);
        Button A3 = (Button) findViewById(R.id.A3);
        A2.setOnClickListener(this);
        A3.setOnClickListener(this);
        Log.i("A1", "onCrteate");
    }

    @Override
    public void onClick(View view) {
        Intent A2 = new Intent(this, MainActivity2.class);
        Intent A3 = new Intent(this, MainActivity3.class);
        switch(view.getId()) {
            case R.id.A2:
                Log.i("A1", "onClick a A2");
                startActivity(A2);
                break;
            case R.id.A3:
                startActivity(A3);
                Log.i("A1", "onClick a A3");
                break;

        }
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i("A1", "onDestroy");
    }

    public void onStart() {
        super.onStart();
        Log.i("A1", "onStart");
    }

    public void onResume() {
        super.onResume();
        Log.i("A1", "onResume");
    }

    public void onRestart() {
        super.onRestart();
        Log.i("A1", "onRestart");
    }

    public void onPause() {
        super.onPause();
        Log.i("A1", "onPause");
    }

    protected void onStop() {
        super.onStop();
        Log.i("A1", "Estoy en onStop");
    }
}