package com.example.intent_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton_contacto = (Button) findViewById(R.id.button_contactos);
        boton_contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/")));
            }
        });

        Button boton_call = (Button) findViewById(R.id.button_call);
        boton_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("tel:34247")));
            }
        });

        Button boton_search = (Button) findViewById(R.id.button_search);
        boton_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_WEB_SEARCH );
                intent.putExtra(SearchManager.QUERY, "Bortolotti");

                startActivity(intent);
            }
        });

        Button boton_voice = (Button) findViewById(R.id.button_voice);
        boton_voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VOICE_COMMAND));
            }
        });
    }
}