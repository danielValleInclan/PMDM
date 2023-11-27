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
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int contFila = 0, contCol = 1;
    private ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9, iv10, iv11, iv12, iv13, iv14, iv15, iv16, iv17, iv18, iv19, iv20, iv21, iv22, iv23, iv24, iv25;

    String palabra = "", adivinarPalabra = "AMIGO";
    ImageView[][] imageViews = new ImageView[5][5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bComenzar = findViewById(R.id.bComenzar);
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        iv4 = findViewById(R.id.iv4);
        iv5 = findViewById(R.id.iv5);
        iv6 = findViewById(R.id.iv6);
        iv7 = findViewById(R.id.iv7);
        iv8 = findViewById(R.id.iv8);
        iv9 = findViewById(R.id.iv9);
        iv10 = findViewById(R.id.iv10);
        iv11 = findViewById(R.id.iv11);
        iv12 = findViewById(R.id.iv12);
        iv13 = findViewById(R.id.iv13);
        iv14 = findViewById(R.id.iv14);
        iv15 = findViewById(R.id.iv15);
        iv16 = findViewById(R.id.iv16);
        iv17 = findViewById(R.id.iv17);
        iv18 = findViewById(R.id.iv18);
        iv19 = findViewById(R.id.iv19);
        iv20 = findViewById(R.id.iv20);
        iv21 = findViewById(R.id.iv21);
        iv22 = findViewById(R.id.iv22);
        iv23 = findViewById(R.id.iv23);
        iv24 = findViewById(R.id.iv24);
        iv25 = findViewById(R.id.iv25);


        bComenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKeyboard();
            }
        });
    }

    @SuppressLint("ResourceType")
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        String nomIv = "iv";
        int numIv = 0;

        if (contCol == 5 || contCol == 1){
            contCol = 1;
            if (contFila == 4 || contFila == 0){
                contFila = 0;// final del intento
            } else contFila++;
        } else contCol++;

        if (contFila == 1) numIv = 5;
        else if (contFila == 2) {
            numIv = 10;
        } else if (contFila == 3) {
            numIv = 15;
        } else if (contFila == 4) {
            numIv = 20;
        }
        numIv += contCol;
        nomIv = nomIv.concat(String.valueOf(numIv));
        System.out.println(nomIv);
        int idImageView = getResources().getIdentifier(nomIv, "id", getPackageName());
        ImageView auxIv = findViewById(idImageView);

        // Verifica el código de tecla presionado
        switch (keyCode) {
            case KeyEvent.KEYCODE_A:
                // Acciones cuando se presiona la tecla 'A'
                palabra.concat("A");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true; // Indica que se ha manejado el evento
            case KeyEvent.KEYCODE_B:
                palabra.concat("B");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_C:
                palabra.concat("C");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_D:
                palabra.concat("D");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_E:
                palabra.concat("E");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_F:
                palabra.concat("F");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_G:
                palabra.concat("G");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_H:
                palabra.concat("H");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_I:
                palabra.concat("I");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_J:
                palabra.concat("J");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_K:
                palabra.concat("K");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_L:
                palabra.concat("L");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_M:
                palabra.concat("M");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_N:
                palabra.concat("N");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_O:
                palabra.concat("O");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_P:
                palabra.concat("P");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_Q:
                palabra.concat("Q");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_R:
                palabra.concat("R");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_S:
                palabra.concat("S");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_T:
                palabra.concat("T");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_U:
                palabra.concat("U");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_V:
                palabra.concat("V");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_W:
                palabra.concat("W");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_X:
                palabra.concat("X");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_Y:
                palabra.concat("Y");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_Z:
                palabra.concat("Z");
                auxIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_check_24));
                return true;
            case KeyEvent.KEYCODE_INSERT:
                comprobarPalabra(palabra);
                return true;
            default:
                return super.onKeyDown(keyCode, event);
        }
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
}