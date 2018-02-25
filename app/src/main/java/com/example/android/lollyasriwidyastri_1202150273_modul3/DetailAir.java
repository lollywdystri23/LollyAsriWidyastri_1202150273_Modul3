package com.example.android.lollyasriwidyastri_1202150273_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailAir extends AppCompatActivity {

    ImageView gambar, btr; //deklarasi variabel gambar dan baterai
    TextView nama, detail, liter; //deklarasi variabel nama,detail,liter
    int total = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_air);
        setTitle("Detail Air"); //set title bar

        //mengakses gambar, nama, detail, liter, baterai yang ada di layout
        gambar = findViewById(R.id.gambar);
        nama = findViewById(R.id.detailNama);
        detail = findViewById(R.id.deskrip);
        liter = findViewById(R.id.lt);
        btr = findViewById(R.id.isi);

        //set gambar dengan gambar yang di dapat intent
        gambar.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("foto"))));
        //set nama pada layout dengan nama yang didapat intent
        nama.setText(getIntent().getStringExtra("nama"));
        //set detail dengan deskripsi yang didapat dari intent
        detail.setText(getIntent().getStringExtra("detail"));
        //set baterai pada level rendah
        btr.setImageLevel(0);
    }

    //method untuk button minus
    public void minus(View view) {
        if (btr.getDrawable().getLevel() - 1 >= 0){
            total = total-2;
            liter.setText(total + "L");
            btr.setImageLevel(btr.getDrawable().getLevel() - 1);
        }else {
            btr.setImageLevel(0);
            Toast.makeText(this, "Hampir Habis", Toast.LENGTH_LONG).show();
        }
    }

    //method untuk button plus
    public void tambah(View view) {
        if(btr.getDrawable().getLevel() + 1 <=4){
            total = total+2;
            liter.setText(total + "L");
            btr.setImageLevel(btr.getDrawable().getLevel() + 1);
        }else {
            btr.setImageLevel(4);
            Toast.makeText(this, "Penuh", Toast.LENGTH_LONG).show();
        }
    }
}

