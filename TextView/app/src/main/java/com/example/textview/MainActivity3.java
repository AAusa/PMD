package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView miTexto = findViewById(R.id.textView3);
        miTexto.append(HtmlCompat.fromHtml("<br><p style = \"color: blue\" \"text-size = 20dp\";><i> Texto añadido con Append desde java</i></p>", HtmlCompat.FROM_HTML_MODE_LEGACY));

    }
}