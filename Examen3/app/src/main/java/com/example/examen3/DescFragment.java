package com.example.examen3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.Serializable;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DescFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DescFragment extends Fragment {
    public static DescFragment newInstance(Producto producto) {
        DescFragment fragment = new DescFragment();
        Bundle args = new Bundle();
        args.putSerializable("clave", producto);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_desc, container, false);

        // Verificar si el Bundle no es null
        if (getArguments() != null) {
            // Acceder al objeto Producto desde el Bundle
            Producto productoSeleccionado = (Producto) getArguments().getSerializable("clave");
            // Actualizar la interfaz de usuario con la información del producto
            TextView textViewDetalle = view.findViewById(R.id.textViewDetalle);
            textViewDetalle.setText(obtenerTextoDetalle(productoSeleccionado.getTitulo()));
        } else {
            // Manejar el caso en el que el Bundle es null
            Log.e("DescFragment", "El Bundle es null");
        }

        return view;
    }

    private String obtenerTextoDetalle(String titulo) {
        switch (titulo) {
            case "PORTÁTIL":
                return "Características de una computadora portátil...\n";
            case "ALTAVOZ":
                return "Un altavoz es un transductor electroacústico...\n";
            case "RATÓN":
                return "Características de un ratón de ordenador...\n";
            case "ALFOMBRILLA":
                return  "...\n";
            case "MICRÓFONO":
                return "... \n";
            default:
                return "";
        }
    }
}