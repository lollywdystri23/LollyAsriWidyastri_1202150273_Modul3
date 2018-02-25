package com.example.android.lollyasriwidyastri_1202150273_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {

        RecyclerView rv;
        menuAdapter adapter;
        List<pilihAir> listmenu;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu);
            setTitle("List Air"); //set title untuk screen List air

            listmenu = new ArrayList<>();
            rv = findViewById(R.id.listMenu); //mendeklarasikan recyclerview
            rv.setHasFixedSize(true);

            //kondisi saat orientasi menjadi landscape
            if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
                rv.setLayoutManager(new GridLayoutManager(Menu.this, 2));
            }else {
                rv.setLayoutManager(new GridLayoutManager(Menu.this, 1));
            }
            initdata(); //menjalankan fungsi initdata
        }

        @Override
        public void onConfigurationChanged(Configuration newConfig) {
            super.onConfigurationChanged(newConfig);
            if (newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
                rv.setLayoutManager(new GridLayoutManager(Menu.this, 2));
            }else {
                rv.setLayoutManager(new GridLayoutManager(Menu.this, 1));
            }
        }

        private void initdata() {
            //masukkan data ke dalam array
            listmenu.add(new pilihAir(R.drawable.ades, "Ades", "Air minum ades. \nAir minum berguna untuk penghilang dehidrasi, menjaga keseimbangan cairan tubuh, menurunkan berat badan, dan meningkatkan energi."));
            listmenu.add(new pilihAir(R.drawable.amidis, "Amidis", "Air minum amidis. \nAir minum berguna untuk penghilang dehidrasi, menjaga keseimbangan cairan tubuh, menurunkan berat badan, dan meningkatkan energi."));
            listmenu.add(new pilihAir(R.drawable.aqua, "Aqua", "Air minum aqua. \nAir minum berguna untuk penghilang dehidrasi, menjaga keseimbangan cairan tubuh, menurunkan berat badan, dan meningkatkan energi."));
            listmenu.add(new pilihAir(R.drawable.cleo, "Cleo", "Air minum cleo. \nAir minum berguna untuk penghilang dehidrasi, menjaga keseimbangan cairan tubuh, menurunkan berat badan, dan meningkatkan energi."));
            listmenu.add(new pilihAir(R.drawable.club, "Club", "Air minum club. \nAir minum berguna untuk penghilang dehidrasi, menjaga keseimbangan cairan tubuh, menurunkan berat badan, dan meningkatkan energi."));
            listmenu.add(new pilihAir(R.drawable.equil, "Equil", "Air minum equil. \nAir minum berguna untuk penghilang dehidrasi, menjaga keseimbangan cairan tubuh, menurunkan berat badan, dan meningkatkan energi."));
            listmenu.add(new pilihAir(R.drawable.evian, "Evian", "Air minum evian. \nAir minum berguna untuk penghilang dehidrasi, menjaga keseimbangan cairan tubuh, menurunkan berat badan, dan meningkatkan energi."));
            listmenu.add(new pilihAir(R.drawable.leminerale, "Le Minerale", "Air minum le minerale. \nAir minum berguna untuk penghilang dehidrasi, menjaga keseimbangan cairan tubuh, menurunkan berat badan, dan meningkatkan energi."));
            listmenu.add(new pilihAir(R.drawable.nestle, "Nestle", "Air minum nestle. \nAir minum berguna untuk penghilang dehidrasi, menjaga keseimbangan cairan tubuh, menurunkan berat badan, dan meningkatkan energi."));
            listmenu.add(new pilihAir(R.drawable.pristine, "Pristine", "Air minum pristine. \nAir minum berguna untuk penghilang dehidrasi, menjaga keseimbangan cairan tubuh, menurunkan berat badan, dan meningkatkan energi."));
            listmenu.add(new pilihAir(R.drawable.vit, "Vit", "Air minum vit. \nAir minum berguna untuk penghilang dehidrasi, menjaga keseimbangan cairan tubuh, menurunkan berat badan, dan meningkatkan energi."));
            adapter = new menuAdapter(this, listmenu); //membuat adapter yang mengubungkan kelas ini dengan data yang ditampilkan
            rv.setAdapter(adapter); //menghubungkan recyclerview dengan viewholder menggunakan adapter
        }
    }