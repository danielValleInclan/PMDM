package com.example.tarea_26;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class MiAdaptador extends ArrayAdapter<Persona>  {

    Context ctx;
    int LayoutTemplates;
    List<Persona> personaList;

    public MiAdaptador(@NonNull Context context, int resource, @NonNull List<Persona> objects) {
        super(context, resource, objects);
    }
}
