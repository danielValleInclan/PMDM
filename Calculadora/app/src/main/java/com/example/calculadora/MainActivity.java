package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    StringBuilder input;
    double num1, num2;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        input = new StringBuilder();

        // Enlazar los botones con su respectivo método onClick
        findViewById(R.id.bt0).setOnClickListener(this::onClickNumber);
        findViewById(R.id.bt1).setOnClickListener(this::onClickNumber);
        findViewById(R.id.bt2).setOnClickListener(this::onClickNumber);
        findViewById(R.id.bt3).setOnClickListener(this::onClickNumber);
        findViewById(R.id.bt4).setOnClickListener(this::onClickNumber);
        findViewById(R.id.bt5).setOnClickListener(this::onClickNumber);
        findViewById(R.id.bt6).setOnClickListener(this::onClickNumber);
        findViewById(R.id.bt7).setOnClickListener(this::onClickNumber);
        findViewById(R.id.bt8).setOnClickListener(this::onClickNumber);
        findViewById(R.id.bt9).setOnClickListener(this::onClickNumber);

        findViewById(R.id.btSuma).setOnClickListener(this::onClickOperator);
        findViewById(R.id.btResta).setOnClickListener(this::onClickOperator);
        findViewById(R.id.btProducto).setOnClickListener(this::onClickOperator);
        findViewById(R.id.btDivision).setOnClickListener(this::onClickOperator);
        findViewById(R.id.btIgual).setOnClickListener(this::onClick);
        findViewById(R.id.btClear).setOnClickListener(this::onClick);
        findViewById(R.id.btDelete).setOnClickListener(this::onClick);
        findViewById(R.id.btDecimal).setOnClickListener(this::onClick);
        findViewById(R.id.btRaiz).setOnClickListener(this::onClick);

    }


    public void onClickNumber(View view) {
        Button button = (Button) view;
        input.append(button.getText().toString());
        textView.setText(input);
    }

    public void onClickOperator(View view) {
        if (input.length() != 0) {
            Button button = (Button) view;
            operator = button.getText().toString();
            num1 = Double.parseDouble(input.toString());
            input.setLength(0);
        }
    }


    public void onClick(View view) {
        Button button = (Button) view;
        String data = button.getText().toString();
        switch (data) {
            case "C":
                input.setLength(0);
                break;
            case "R":
                if (input.length() > 0) {
                    input.setLength(input.length() - 1);
                }
                break;
            case "=":
                if (input.length() != 0 && operator != null){
                    num2 = Double.parseDouble(input.toString());
                    double result = 0;
                    switch (operator){
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 != 0){
                                result = num1 / num2;
                            } else {
                                textView.setText("No se puede dividir entre 0");
                            }
                            break;
                    }
                    // Mostrar el resultado en el TextView
                    textView.setText(String.valueOf(result));
                    // Restablecer las variables para la próxima operación
                    num1 = result;
                    input.setLength(0);
                    operator = null;
                }
                break;
            default:
                input.append(data);
        }
        textView.setText(input);
    }


}