package com.example.examen3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listViewProductos;
    private List<Producto> productos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!esTableta()){
            setContentView(R.layout.activity_main);
            listViewProductos = findViewById(R.id.listViewProductos);
            productos = insertarProductos();
            insertarProductos();
            MiAdaptador miAdaptador = new MiAdaptador(
                    this,
                    R.layout.product_item,
                    productos
            );
            listViewProductos.setAdapter(miAdaptador);
            listViewProductos.setOnItemClickListener(this);
        } else {
            setContentView(R.layout.activity_main_tablet);
            listViewProductos = findViewById(R.id.listViewProductos2);
            insertarProductos();
            MiAdaptador miAdaptador = new MiAdaptador(
                    this,
                    R.layout.product_item,
                    productos
            );
            listViewProductos.setAdapter(miAdaptador);
            listViewProductos.setOnItemClickListener(this);
        }

    }
    private List<Producto> insertarProductos(){
        return Arrays.asList(new Producto("PORTÁTIL", 600),
                new Producto("ALTAVOZ", 33),
                new Producto("RATÓN", 20),
                new Producto("ALFOMBRILLA", 10),
                new Producto("MICRÓFONO", 14),
                new Producto("USB", 70));
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Producto productoSeleccionado = productos.get(position);
        Toast.makeText(this, "Entrando a descripción de " + productoSeleccionado.getTitulo(), Toast.LENGTH_SHORT).show();

        if (esTableta()) {
            // Si es una tableta, muestra el detalle en un fragmento
            DescFragment detalleFragment = new DescFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("clave", productoSeleccionado);
            detalleFragment.setArguments(bundle);
        } else {
            // Si es un móvil, inicia una nueva actividad de detalle
            Intent intent = new Intent(this, DetalleProductoActivity.class);
            intent.putExtra("producto", productoSeleccionado.getTitulo());
            startActivity(intent);
        }
    }

    private boolean esTableta() {
        // Verifica si el dispositivo es una tableta
        return getResources().getBoolean(R.bool.es_tableta);
    }
}