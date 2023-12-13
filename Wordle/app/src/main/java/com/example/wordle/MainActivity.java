package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int contFila = 0, contCol = 1;
    private EditText[] editTextArray = new EditText[25];
    String palabra = "", adivinarPalabra = "AMIGO";
    ImageView[][] imageViews = new ImageView[5][5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bComenzar = findViewById(R.id.bComenzar);
        for (int i = 1; i <= 25; i++) {
            int editTextId = getResources().getIdentifier("et" + i, "id", getPackageName());
            editTextArray[i - 1] = findViewById(editTextId);

            final int nextIndex = i % 25;
            final EditText currentEditText = editTextArray[i - 1];

            // Agregar TextWatcher a cada EditText
            currentEditText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int start, int before, int count) {
                    // No se necesita implementación aquí
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                    // Verificar si se ha ingresado un carácter
                    if (count > 0) {
                        // Mover el foco al siguiente editText
                        editTextArray[nextIndex].requestFocus();

                        // Verificar si estamos al final de la fila (cada fila tiene 5 EditText)
                        if (nextIndex % 5 == 0) {
                            // Realizar acciones adicionales aquí, como verificar la palabra formada
                            // y realizar otras tareas después de completar una fila
                            String palabraFormada = getWordFromRow(nextIndex);
                            // Realizar acciones adicionales con la palabra formada
                            if (comprobarPalabra(palabraFormada)){
                               Toast.makeText(MainActivity.this, "Has ganadooo", Toast.LENGTH_SHORT).show();
                               // colorear los edittext de la linea de verde
                            }else {
                                
                            }

                            // Limpieza o reinicio si es necesario
                            // ...
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    // No se necesita implementación aquí
                }
            });
        }
    }
    private boolean comprobarPalabra(String palabra){
        if (palabra.equals(adivinarPalabra)){
            return true;
        }
        return false;
    }

    // Método para obtener la palabra formada en una fila
    private String getWordFromRow(int currentIndex) {
        StringBuilder wordBuilder = new StringBuilder();
        int start = currentIndex - 4; // Obtener el índice inicial de la fila
        for (int i = start; i <= currentIndex; i++) {
            wordBuilder.append(editTextArray[i % 25].getText().toString());
        }
        return wordBuilder.toString();
    }
}


/*
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

 */