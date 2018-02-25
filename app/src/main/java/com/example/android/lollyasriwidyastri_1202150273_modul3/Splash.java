package com.example.android.lollyasriwidyastri_1202150273_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

public class Splash extends AppCompatActivity {

    private static int splashInterval = 3000; //waktu splash=3detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//command ini digunakan untuk membuat layar aplikasi menjadi full screen//
        setContentView(R.layout.activity_splash);

        //waktu eksekusi splash dan lama penundaan hingga runnable/pindah ke activity selanjutnya di eksekusi
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Login.class); //pindah screen
                startActivity(intent);
            }

            private void finish() {

            }
        }, splashInterval);
    }
}