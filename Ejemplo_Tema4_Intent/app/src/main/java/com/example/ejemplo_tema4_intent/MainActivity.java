package com.example.ejemplo_tema4_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText_nombre = (EditText) findViewById(R.id.editText_nombre);
        EditText editText_apellidos = (EditText) findViewById(R.id.editText_apellidos);
        Button button_nombre = (Button) findViewById(R.id.button_nombre);
        Button button_apellidos = (Button) findViewById(R.id.button_apellidos);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        button_nombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = editText_nombre.getText().toString();
                intent.putExtra("Nombre", nombre);
                intent.putExtra("valor", 1);
                startActivity(intent);
            }
        });
        button_apellidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String apellidos = editText_apellidos.getText().toString();
                intent.putExtra("Apellidos", apellidos);
                intent.putExtra("valor", 2);
                startActivity(intent);
            }
        });
    }
}