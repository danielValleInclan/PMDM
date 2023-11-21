package com.example.examen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText userNameET, passwdET;
    private List<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameET = findViewById(R.id.etName);
        passwdET = findViewById(R.id.etPasswd);

        // Usuarios registrados
        userList = new ArrayList<>();
        userList.add(new User("usuario", "usuario"));
        userList.add(new User("internauta", "internauta"));
        userList.add(new User("Cliente", "Cliente"));
        userList.add(new User("navegante", "navegante"));
    }

    public void onLoginClick(View view){
        String username = userNameET.getText().toString();
        String password = passwdET.getText().toString();

        boolean isValidUser = false;
        for (User user : userList) {
            if (user.getName().equals(username) && user.getPassw().equals(password)) {
                isValidUser = true;
                break;
            }
        }

        // Mostrar notificación y limpiar campos
        if (isValidUser) {
            // Ir a la segunda pantalla
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("name", username);
            intent.putExtra("passwd", password);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Usuario o contraseña no válidos", Toast.LENGTH_SHORT).show();
            userNameET.setText("");
            passwdET.setText("");
        }
    }
}