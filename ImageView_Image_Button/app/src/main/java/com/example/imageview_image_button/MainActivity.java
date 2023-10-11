package com.example.imageview_image_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = (ImageView) findViewById(R.id.walter_calvo);
        ImageView imageView2 = (ImageView) findViewById(R.id.walter_sombrero);
        ImageButton imageButton1 = (ImageButton) findViewById(R.id.botonTelefonoOff);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton1.setVisibility(View.GONE);
                imageView1.setVisibility(View.GONE);
                imageButton2.setVisibility(View.VISIBLE);
                imageView2.setVisibility(View.VISIBLE);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageButton2.setVisibility(View.GONE);
                imageView2.setVisibility(View.GONE);
                imageButton1.setVisibility(View.VISIBLE);
                imageView1.setVisibility(View.VISIBLE);
            }
        });

    }
}