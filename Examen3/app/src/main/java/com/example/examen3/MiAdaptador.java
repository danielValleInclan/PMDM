package com.example.examen3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MiAdaptador extends ArrayAdapter<Producto> {

    Context ctx;
    int layoutTemplate;
    List<Producto> productos;

    public MiAdaptador(@NonNull Context context, int resource, @NonNull List<Producto> objects) {
        super(context, resource, objects);

        this.ctx = context;
        this.layoutTemplate = resource;
        this.productos = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(ctx).inflate(layoutTemplate, parent, false);

        // Obtener la info del elemento de la lista que estoy iterando
        Producto elementoActual = productos.get(position);

        // Rescatar los elementos de la interfaz de usuario de la plantilla
        TextView textViewTitulo = v.findViewById(R.id.textViewTitulo);
        TextView textViewPrecio = v.findViewById(R.id.textViewPrecio);

        // Hacer un set de la info del elemento actual en los elementos de la IU
        textViewTitulo.setText(elementoActual.getTitulo());
        textViewPrecio.setText(elementoActual.getPrecio()+ " euros");

        return v;

    }


}
