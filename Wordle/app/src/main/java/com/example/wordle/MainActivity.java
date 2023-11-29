package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int contFila = 0, contCol = 1;
    private EditText et1, et2, et3, et4, et5, et6, et7, et8, et9, et10, et11, et12, et13, et14, et15, et16, et17, et18, et19, et20, et21, et22, et23, et24, et25;

    String palabra = "", adivinarPalabra = "AMIGO";
    ImageView[][] imageViews = new ImageView[5][5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bComenzar = findViewById(R.id.bComenzar);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        et5 = findViewById(R.id.et5);
        et6 = findViewById(R.id.et6);
        et7 = findViewById(R.id.et7);
        et8 = findViewById(R.id.et8);
        et9 = findViewById(R.id.et9);
        et10 = findViewById(R.id.et10);
        et11 = findViewById(R.id.et11);
        et12 = findViewById(R.id.et12);
        et13 = findViewById(R.id.et13);
        et14 = findViewById(R.id.et14);
        et15 = findViewById(R.id.et15);
        et16 = findViewById(R.id.et16);
        et17 = findViewById(R.id.et17);
        et18 = findViewById(R.id.et18);
        et19 = findViewById(R.id.et19);
        et20 = findViewById(R.id.et20);
        et21 = findViewById(R.id.et21);
        et22 = findViewById(R.id.et22);
        et23 = findViewById(R.id.et23);
        et24 = findViewById(R.id.et24);
        et25 = findViewById(R.id.et25);


        bComenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {
                    boolean finJuego = false;

                    // jugar mientras no acaben las filas
                    boolean finCol = false;
                    String nomEd = "et";
                    int numEd = 0;

                    // Comprobar el número de columna
                    if (contCol == 5 || contCol == 1){
                        finCol = true;
                        contCol = 1;
                        if (contFila == 4 || contFila == 0){
                            contFila = 0;// final del intento
                        } else contFila++;
                    } else contCol++;

                    if (contFila == 1) numEd = 5;
                    else if (contFila == 2) {
                        numEd = 10;
                    } else if (contFila == 3) {
                        numEd = 15;
                    } else if (contFila == 4) {
                        numEd = 20;
                        finJuego = true;
                    }
                    numEd += contCol;
                    nomEd = nomEd.concat(String.valueOf(numEd));
                    System.out.println(nomEd);
                    int idEditText = getResources().getIdentifier(nomEd, "id", getPackageName());
                    EditText auxEd = findViewById(idEditText);

                }
            }
        });
    }
    private void comprobarPalabra(String palabra){
        if (palabra.equals(adivinarPalabra)){
            Toast.makeText(this, "Has ganadoooo", Toast.LENGTH_SHORT);
        }
    }

    private void openKeyboard(){
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (inputMethodManager != null){
            inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
        }
    }



    // Verifica el código de tecla presionado
                        /*
                        switch (keyCode) {
                            case KeyEvent.KEYCODE_A:
                                // Acciones cuando se presiona la tecla 'A'
                                palabra.concat("A");
                            case KeyEvent.KEYCODE_B:
                                palabra.concat("B");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.baseline_check_24));
                            case KeyEvent.KEYCODE_C:
                                palabra.concat("C");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_D:
                                palabra.concat("D");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_E:
                                palabra.concat("E");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_F:
                                palabra.concat("F");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_G:
                                palabra.concat("G");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_H:
                                palabra.concat("H");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_I:
                                palabra.concat("I");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_J:
                                palabra.concat("J");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_K:
                                palabra.concat("K");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_L:
                                palabra.concat("L");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_M:
                                palabra.concat("M");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_N:
                                palabra.concat("N");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_O:
                                palabra.concat("O");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_P:
                                palabra.concat("P");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_Q:
                                palabra.concat("Q");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_R:
                                palabra.concat("R");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_S:
                                palabra.concat("S");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_T:
                                palabra.concat("T");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_U:
                                palabra.concat("U");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_V:
                                palabra.concat("V");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_W:
                                palabra.concat("W");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_X:
                                palabra.concat("X");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_Y:
                                palabra.concat("Y");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_Z:
                                palabra.concat("Z");
                                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));

                            case KeyEvent.KEYCODE_INSERT:
                                if (finCol){
                                    comprobarPalabra(palabra);
                                }
                            default:
                        }
                         */

}