package com.example.ejintentsexplicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.i("A3", "onCreate");
    }

    public void onDestroy() {
        Intent A2 = new Intent(this, MainActivity2.class);
        super.onDestroy();
        startActivity(A2);
        Log.i("A3", "onDestroy a A2");

    }
    public void onStart() {
        super.onStart();
        Log.i("A3", "onStart");
    }

    public void onResume() {
        super.onResume();
        Log.i("A3", "onResume");
    }

    public void onRestart() {
        super.onRestart();
        Log.i("A3", "onRestart");
    }

    public void onPause() {
        super.onPause();
        Log.i("A3", "onPause");
    }

    protected void onStop() {
        super.onStop();
        Log.i("A3", "Estoy en onStop");
    }
}