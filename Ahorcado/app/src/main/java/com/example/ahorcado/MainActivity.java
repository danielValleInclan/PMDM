package com.example.ahorcado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String palabraOculta;
        Resources res = getResources();
        String[] palabrasOcultas = res.getStringArray(R.array.palabrasOcultas);
        Random random = new Random();
        int maxNum = palabrasOcultas.length - 1;
        int randomNum = random.nextInt(maxNum-0) + 0; //Indice de la palabra oculta
        TextView palabraOcultaLabel = (TextView) findViewById(R.id.palabraOcultaLabel);

        //Falta mostrar la palabra oculta con guiones

        palabraOculta = palabrasOcultas[randomNum];
        palabraOcultaLabel.setText(palabrasOcultas[randomNum]); //Muestra de la palabra oculta
    }
}