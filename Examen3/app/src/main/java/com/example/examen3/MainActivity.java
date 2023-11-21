package com.example.examen3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listViewProductos;
    private List<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewProductos = findViewById(R.id.listViewProductos);
        productos = new ArrayList<>();
        productos.add(new Producto("PORTÁTIL", 600));
        productos.add(new Producto("ALTAVOZ", 33));
        productos.add(new Producto("RATÓN", 20));
        productos.add(new Producto("ALFOMBRILLA", 10));
        productos.add(new Producto("MICRÓFONO", 14));


        MiAdaptador miAdaptador = new MiAdaptador(
                this,
                R.layout.product_item,
                productos
        );
        listViewProductos.setAdapter(miAdaptador);
        listViewProductos.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(this, "Has pulsado el elemento" + position, Toast.LENGTH_SHORT).show();
    }
}