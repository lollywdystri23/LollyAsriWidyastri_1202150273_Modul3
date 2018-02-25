package com.example.android.lollyasriwidyastri_1202150273_modul3;

/**
 * Created by Lolly on 2/25/2018.
 */

public class pilihAir {

    int foto;
    String nama;
    String detail;

    //method setter
    public pilihAir(int foto, String nama, String detail) {
        this.foto = foto;
        this.nama = nama;
        this.detail = detail;
    }

    //method getter
    public int getFoto() {
        return foto;
    }

    public String getNama() {
        return nama;
    }

    public String getDetail() {return detail; }

}