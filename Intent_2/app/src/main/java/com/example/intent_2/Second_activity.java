package com.example.intent_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Second_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Bundle bundle = getIntent().getExtras();
        Integer num = bundle.getInt("Etiqueta número");
        Toast.makeText(this, "Número: " + num, Toast.LENGTH_SHORT).show();
        String nombre = bundle.getString("Etiqueta nombre");
        Toast.makeText(this, "Nombre: " + nombre, Toast.LENGTH_SHORT).show();

        Button button = (Button) findViewById(R.id.button_back_to_main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second_activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
