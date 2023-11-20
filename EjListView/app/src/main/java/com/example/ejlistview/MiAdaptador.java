package com.example.ejlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MiAdaptador extends ArrayAdapter<Averia> {

    Context ctx;
    int layoutTemplate;
    List<Averia> averiaList;

    public MiAdaptador(@NonNull Context context, int resource, @NonNull List<Averia> objects) {
        super(context, resource, objects);

        this.layoutTemplate = resource;
        this.ctx = context;
        this.averiaList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(ctx).inflate(layoutTemplate, parent, false);

        // Obtener la info del elemento de la lista que estoy iterando
        Averia elementoActual = averiaList.get(position);

        // Rescatar los elementos de la interfaz de usuario de la plantilla
        TextView textViewTitulo = v.findViewById(R.id.tvTitulo);
        TextView textViewModelo = v.findViewById(R.id.tvModeloCoche);
        TextView textViewPresupuesto = v.findViewById(R.id.tvPresupuesto);
        ImageView imageViewFoto = v.findViewById(R.id.ivFoto);

        // Hacer un set de la info del elemento actual en los elementos de la IU
        textViewTitulo.setText(elementoActual.getTitulo());
        textViewModelo.setText(elementoActual.getModelo());
        textViewPresupuesto.setText(elementoActual.getPresupuesto()+" presupuestos");



        return v;
    }
}
