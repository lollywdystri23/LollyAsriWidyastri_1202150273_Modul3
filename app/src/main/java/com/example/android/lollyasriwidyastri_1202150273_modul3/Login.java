package com.example.android.lollyasriwidyastri_1202150273_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button log;
    private EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Login"); //set title bar

        //mengambil id edit text dan button yang ada di layout
        log = findViewById(R.id.buttonLogin);
        user = findViewById(R.id.editUser);
        pass = findViewById(R.id.editPass);
    }
    //method untuk login
    public void login(View view) {
        final String nama = user.getText().toString();
        String word = pass.getText().toString();

        if (nama.equals("EAD") && word.equals("MOBILE")){ //kondisi login berhasil
            Toast.makeText(this, "Login Success!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Login.this, Menu.class); //pindah ke activity menu air
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),"Login Failed!", Toast.LENGTH_SHORT).show(); //kondisi login gagal
        }
    }
}