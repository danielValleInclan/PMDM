package com.example.ejlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private List<Averia> averiaList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        averiaList = new ArrayList<>();
        averiaList.add(new Averia("Espejo roto", "Audi A4", "https://seguros.elcorteingles.es/content/dam/eci-seguros/es/blog/blog-mayo/el-seguro-cubre-el-espejo-retrovisor.jpg", 2));
        averiaList.add(new Averia("Paragolpes delantero", "Audi A4", "", 4));
        averiaList.add(new Averia("Ventanilla rota", "Citroen", "", 1));

        MiAdaptador adapadorAverias = new MiAdaptador(
                this,
                R.layout.averia_item,
                averiaList
        );

        listView.setAdapter(adapadorAverias);

        //Evento click

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        view.animate().rotationY(360).setDuration(1000).start();
    }
}