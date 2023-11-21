package com.example.examen3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalleProductoActivity extends AppCompatActivity {
    private Producto producto;
    private TextView textViewDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        textViewDesc = findViewById(R.id.textViewDesc);
        Bundle bundle = getIntent().getExtras();
        producto = (Producto) bundle.get("producto");
    }
}
