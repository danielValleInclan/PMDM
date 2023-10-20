package com.example.ejemplo_tema4_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Bundle bundle = getIntent().getExtras();
        int valor = bundle.getInt("valor");
        String texto;
        if (valor == 1){
            texto = bundle.getString("Nombre");
        } else {
            texto = bundle.getString("Apellidos");
        }
        EditText editText = (EditText) findViewById(R.id.editText_valor);
        editText.setText(texto);
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        Button button_aceptar = (Button) findViewById(R.id.button_aceptar);
        Button button_cancelar = (Button) findViewById(R.id.button_cancelar);
        button_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("valor", editText.getText().toString());
                startActivity(intent);
            }
        });
        button_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}
