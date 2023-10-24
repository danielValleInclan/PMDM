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
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        final String[] pulsado = {""};

        TextView resultado = (TextView) findViewById(R.id.resultado);
        TextView seleccion = (TextView) findViewById(R.id.seleccion);
        ImageView imageView = (ImageView) findViewById(R.id.imagen);
        Button butonPlay = (Button) findViewById(R.id.buttonPlay);
        ImageButton buttonPiedra = (ImageButton) findViewById(R.id.buttonPiedra);
        ImageButton buttonPapel = (ImageButton) findViewById(R.id.buttonPapel);
        ImageButton buttonTijera = (ImageButton) findViewById(R.id.buttonTijera);
        Toast toast = Toast.makeText(this, "Debes seleccionar una opción", Toast.LENGTH_SHORT);
        butonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String maquinaResult = "";
                int randNum = (int) Math.floor(Math.random()*(4-1+1)+1);
                switch (randNum){
                    case 1:
                        maquinaResult = "piedra";
                        imageView.setImageDrawable(res.getDrawable(R.drawable.piedra));
                        break;
                    case 2:
                        maquinaResult = "papel";
                        imageView.setImageDrawable(res.getDrawable(R.drawable.papel));
                        break;
                    case 3:
                        maquinaResult = "tijera";
                        imageView.setImageDrawable(res.getDrawable(R.drawable.tijera));
                        break;
                }

                if (maquinaResult.equals(pulsado[0])){
                    resultado.setText("Empate!!!");
                } else if (maquinaResult.equals("tijera") && pulsado[0].equals("papel") ||
                        maquinaResult.equals("piedra") && pulsado[0].equals("tijera") ||
                        maquinaResult.equals("papel") && pulsado[0].equals("piedra")) {
                    resultado.setText("Has perdido");
                } else {
                    resultado.setText("Has ganado!!!!");
                }
            }
        });

        buttonPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pulsado[0] = "papel";
                seleccion.setText("Has seleccionado papel");
            }
        });

        buttonPiedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pulsado[0] = "piedra";
                seleccion.setText("Has seleccionado piedra");
            }
        });

        buttonTijera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pulsado[0] = "tijera";
                seleccion.setText("Has seleccionado tijeras");
            }
        });

    }
}