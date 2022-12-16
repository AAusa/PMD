package com.example.ejintentsexplicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button A3 = (Button) findViewById(R.id.A3);
        A3.setOnClickListener(this);
        Log.i("A2", "onCreate");

    }
    @Override
    public void onClick(View view) {
        Intent A3 = new Intent(this, MainActivity3.class);
        switch(view.getId()) {
            case R.id.A3:
                Log.i("A2", "onCLick a A3");
                startActivity(A3);
                break;
        }
    }

    public void onDestroy() {
        Intent A1 = new Intent(this, MainActivity.class);
        super.onDestroy();
        startActivity(A1);
        Log.i("A2", "onDestroy a A1");
    }
    public void onStart() {
        super.onStart();
        Log.i("A2", "onStart");
    }

    public void onResume() {
        super.onResume();
        Log.i("A2", "onResume");
    }

    public void onRestart() {
        super.onRestart();
        Log.i("A2", "onRestart");
    }

    public void onPause() {
        super.onPause();
        Log.i("A2", "onPause");
    }

    protected void onStop() {
        super.onStop();
        Log.i("A2", "Estoy en onStop");
    }
}