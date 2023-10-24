package com.example.piedrapapeltijera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();

        ImageView imageView = (ImageView) findViewById(R.id.imagen);
        Button butonPlay = (Button) findViewById(R.id.buttonPlay);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        ImageButton buttonPiedra = (ImageButton) findViewById(R.id.buttonPiedra);
        ImageButton buttonPapel = (ImageButton) findViewById(R.id.buttonPapel);
        ImageButton buttonTijera = (ImageButton) findViewById(R.id.buttonTijera);
        Toast toast = Toast.makeText(this, "Debes seleccionar una opción", Toast.LENGTH_SHORT);
        butonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}