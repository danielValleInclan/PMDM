package com.example.clasebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button= (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View view) {
                 System.out.println("DEBUG: Me hicieron click");
             }
        });
    }
}