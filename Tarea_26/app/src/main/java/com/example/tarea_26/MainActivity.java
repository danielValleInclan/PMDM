package com.example.tarea_26;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<String> nombres;
    private List<Persona> personaList;
    private ListView lista1;
    private ListView listaPersonas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // List view 1
        lista1 = findViewById(R.id.listView1);
        nombres = new ArrayList<>();

        nombres.add("Daniel");
        nombres.add("Josue");
        nombres.add("Fran");
        //...

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                nombres
        );
        lista1.setAdapter(adapter);

        lista1.setOnItemClickListener(this);

        //ListView2

        listaPersonas = findViewById(R.id.listView2);

        personaList.add(new Persona("Daniel", 20));
        personaList.add(new Persona("Fran", 19));
        personaList.add(new Persona("David", 17));

        MiAdaptador personaArrayAdapter = new MiAdaptador(
                this,
                android.R.layout.persona_item,
                personaList
        );
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "Nombre seleccionado: "+nombres.get(i), Toast.LENGTH_SHORT).show();

        //view.animate().rotation(360).setDuration(1000).start();
    }
}