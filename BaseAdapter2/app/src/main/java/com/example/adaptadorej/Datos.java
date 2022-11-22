package com.example.adaptadorej;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Datos {
    private int imagen;
    private String titulo;
    private String descripcion;

    public Datos (int imagen, String titulo, String descripcion){
        this.imagen = imagen;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public int getImagen(){
        return imagen;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getDescripcion(){
        return descripcion;
    }
}
