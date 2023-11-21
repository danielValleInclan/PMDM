package com.example.examen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    TextView usernameTV, passwdTV;
    ListView productosLV;
    private List<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        usernameTV = findViewById(R.id.tvName);
        passwdTV = findViewById(R.id.tvPasswd);
        productosLV = findViewById(R.id.lvProductos);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String passwd = bundle.getString("passwd");

        usernameTV.setText(usernameTV.getText()+ " " + name);
        passwdTV.setText(passwdTV.getText()+ " " + passwd);

        products = new ArrayList<>();
        products.add(new Product(R.drawable.portatil, "PORTÁTIL", 600));
        products.add(new Product(R.drawable.altavoz, "ALTAVOZ", 33));
        products.add(new Product(R.drawable.raton, "RATÓN", 20));
        products.add(new Product(R.drawable.mousepad, "ALFOMBRILLA", 10));
        products.add(new Product(R.drawable.microfono, "MICRÓFONO", 14));
        products.add(new Product(R.drawable.usb, "USB", 70));

        ProductAdapter adapter = new ProductAdapter(this, products);
        productosLV.setAdapter(adapter);


        productosLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Rotar el elemento
                Toast.makeText(SecondActivity.this, "Rotar Elemento", Toast.LENGTH_SHORT).show();
            }
        });

        productosLV.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                // Eliminar el elemento
                products.remove(position);
                adapter.notifyDataSetChanged();
                return true;
            }
        });
    }

    public void onBackClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}