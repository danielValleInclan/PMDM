package com.example.claseradiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.radioButtonTalavera) {
                    textView.setText("Tu equipo favorito es el Talavera F.C");
                } else if (i == R.id.radioButtonGimastico) {
                    textView.setText("Tu equipo favorito es Gimastico de Alcazar");
                } else if (i == R.id.radioButtonAlbcete) {
                    textView.setText("Tu equipo favorito es Albacete Balompié");
                } else if (i == R.id.radioButtonBetis) {
                    textView.setText("Tu equipo favorito es el Real Betis Balonpié");
                }

            };
        });

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox2);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView2.setText("Me gusta el fútbol!!!!!");
                } else {
                    textView2.setText("");
                }
            }
        });

    }
}