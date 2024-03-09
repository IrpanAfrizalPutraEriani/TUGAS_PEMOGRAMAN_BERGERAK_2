package com.example.tugas_2_peber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class KeduaActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        CardView Kemeja1 = findViewById(R.id.kemeja1);
        CardView Kemeja2 = findViewById(R.id.kemeja2);
        CardView Kemeja3 = findViewById(R.id.kemeja3);
        CardView Kemeja4 = findViewById(R.id.kemeja4);
        CardView Kemeja5 = findViewById(R.id.kemeja5);

        Kemeja1.setOnClickListener(this);
        Kemeja2.setOnClickListener(this);
        Kemeja3.setOnClickListener(this);
        Kemeja4.setOnClickListener(this);
        Kemeja5.setOnClickListener(this);


        // Di sini Anda dapat menambahkan kode untuk mengatur tampilan atau melakukan operasi lainnya
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.kemeja1) {
            Intent CardViewPertama = new Intent(KeduaActivity.this, TeksActivity.class);
            startActivity(CardViewPertama);
            String Nama1 = "Otsky Kemeja Pria Kualitas Premium Lengan Pendek";
            String Deskripsi1 = "Perfect healing partner! NAKA Cuban Shirt dengan cuttingan yang loose dan potongan leher yang rendah membuat sirkulasi udara menjadi lebih leluasa dan memberikan sensasi sejuk.\n" +
                    "\n" +
                    "Dengan menggunakan bahan “Brushed Cotton Poplin” yang lembut, halus, dan ringan, namun tetap memberikan “shape” yang bagus untuk badan, memberikan kenyamanan ekstra namun tetap stylish.\n" +
                    "\n" +
                    "Breeze\n" +
                    "Extremely soft\n" +
                    "Doesn’t wrinkle easily\n" +
                    "\n" +
                    "\n" +
                    "Material: Brushed Cotton Poplin\n" +
                    "Cutting: Oversized\n" +
                    "\n" +
                    "Price: IDR 179.000\n" +
                    "Weight: 215gr\n" +
                    "\n" +
                    "On model :\n" +
                    "TB/BB: 186 cm/72 kg\n" +
                    "Size: XL (oversized)\n" +
                    "Link : https://shopee.co.id/Otsky-Kemeja-Pria-Kualitas-Premium-Lengan-Pendek-Basic-i.9564053.19700315659?sp_atk=7589d009-3bf1-4304-9b93-c62c82b717f4&xptdk=7589d009-3bf1-4304-9b93-c62c82b717f4";
            String Harga1 = "Harga : Rp. 500.000 ";

            CardViewPertama.putExtra("Gambar", R.drawable.bajuhitam);
            CardViewPertama.putExtra("Nama", Nama1);
            CardViewPertama.putExtra("Deskripsi", Deskripsi1);
            CardViewPertama.putExtra("Harga", Harga1);
            startActivity(CardViewPertama);

        } else if(v.getId() == R.id.kemeja2) {
            Intent CardViewKedua = new Intent(KeduaActivity.this, TeksActivity.class);
            String Nama1 = "Otsky Kemeja Pria Kualitas Premium Lengan Pendek";
            String Deskripsi1 = "Perfect healing partner! NAKA Cuban Shirt dengan cuttingan yang loose dan potongan leher yang rendah membuat sirkulasi udara menjadi lebih leluasa dan memberikan sensasi sejuk.\n" +
                    "\n" +
                    "Dengan menggunakan bahan “Brushed Cotton Poplin” yang lembut, halus, dan ringan, namun tetap memberikan “shape” yang bagus untuk badan, memberikan kenyamanan ekstra namun tetap stylish.\n" +
                    "\n" +
                    "Breeze\n" +
                    "Extremely soft\n" +
                    "Doesn’t wrinkle easily\n" +
                    "\n" +
                    "\n" +
                    "Material: Brushed Cotton Poplin\n" +
                    "Cutting: Oversized\n" +
                    "\n"  +
                    "Weight: 215gr\n" +
                    "\n" +
                    "On model :\n" +
                    "TB/BB: 186 cm/72 kg\n" +
                    "Size: XL (oversized)\n"+
                    "Link : https://shopee.co.id/Otsky-Kemeja-Pria-Kualitas-Premium-Lengan-Pendek-Basic-i.9564053.19700315659?sp_atk=7589d009-3bf1-4304-9b93-c62c82b717f4&xptdk=7589d009-3bf1-4304-9b93-c62c82b717f4";
            String Harga1 = "Harga : Rp. 500.000 ";

            CardViewKedua.putExtra("Gambar", R.drawable.bajuputih);
            CardViewKedua.putExtra("Nama", Nama1);
            CardViewKedua.putExtra("Deskripsi", Deskripsi1);
            CardViewKedua.putExtra("Harga", Harga1);
            startActivity(CardViewKedua);

        } else if (v.getId() == R.id.kemeja3) {
            Intent CardViewKetiga = new Intent(KeduaActivity.this, TeksActivity.class);
            String Nama1 = "Otsky Kemeja Pria Kualitas Premium Lengan Pendek";
            String Deskripsi1 = "Perfect healing partner! NAKA Cuban Shirt dengan cuttingan yang loose dan potongan leher yang rendah membuat sirkulasi udara menjadi lebih leluasa dan memberikan sensasi sejuk.\n" +
                    "\n" +
                    "Dengan menggunakan bahan “Brushed Cotton Poplin” yang lembut, halus, dan ringan, namun tetap memberikan “shape” yang bagus untuk badan, memberikan kenyamanan ekstra namun tetap stylish.\n" +
                    "\n" +
                    "Breeze\n" +
                    "Extremely soft\n" +
                    "Doesn’t wrinkle easily\n" +
                    "\n" +
                    "\n" +
                    "Material: Brushed Cotton Poplin\n" +
                    "Cutting: Oversized\n" +
                    "\n"  +
                    "Weight: 215gr\n" +
                    "\n" +
                    "On model :\n" +
                    "TB/BB: 186 cm/72 kg\n" +
                    "Size: XL (oversized)\n"+
                    "Link : https://shopee.co.id/Otsky-Kemeja-Pria-Kualitas-Premium-Lengan-Pendek-Basic-i.9564053.19700315659?sp_atk=7589d009-3bf1-4304-9b93-c62c82b717f4&xptdk=7589d009-3bf1-4304-9b93-c62c82b717f4";
            String Harga1 = "Harga : Rp. 500.000 ";

            CardViewKetiga.putExtra("Gambar", R.drawable.bajuabuabu);
            CardViewKetiga.putExtra("Nama", Nama1);
            CardViewKetiga.putExtra("Deskripsi", Deskripsi1);
            CardViewKetiga.putExtra("Harga", Harga1);
            startActivity(CardViewKetiga);
        } else if (v.getId() == R.id.kemeja4) {
            Intent CardViewKeempat = new Intent(KeduaActivity.this, TeksActivity.class);
            String Nama1 = "Otsky Kemeja Pria Kualitas Premium Lengan Pendek";
            String Deskripsi1 = "Perfect healing partner! NAKA Cuban Shirt dengan cuttingan yang loose dan potongan leher yang rendah membuat sirkulasi udara menjadi lebih leluasa dan memberikan sensasi sejuk.\n" +
                    "\n" +
                    "Dengan menggunakan bahan “Brushed Cotton Poplin” yang lembut, halus, dan ringan, namun tetap memberikan “shape” yang bagus untuk badan, memberikan kenyamanan ekstra namun tetap stylish.\n" +
                    "\n" +
                    "Breeze\n" +
                    "Extremely soft\n" +
                    "Doesn’t wrinkle easily\n" +
                    "\n" +
                    "\n" +
                    "Material: Brushed Cotton Poplin\n" +
                    "Cutting: Oversized\n" +
                    "\n"  +
                    "Weight: 215gr\n" +
                    "\n" +
                    "On model :\n" +
                    "TB/BB: 186 cm/72 kg\n" +
                    "Size: XL (oversized)\n" +
                    "Link : https://shopee.co.id/Otsky-Kemeja-Pria-Kualitas-Premium-Lengan-Pendek-Basic-i.9564053.19700315659?sp_atk=7589d009-3bf1-4304-9b93-c62c82b717f4&xptdk=7589d009-3bf1-4304-9b93-c62c82b717f4";
            String Harga1 = "Harga : Rp. 500.000 ";

            CardViewKeempat.putExtra("Gambar", R.drawable.bajucoklat);
            CardViewKeempat.putExtra("Nama", Nama1);
            CardViewKeempat.putExtra("Deskripsi", Deskripsi1);
            CardViewKeempat.putExtra("Harga", Harga1);
            startActivity(CardViewKeempat);
        } else if (v.getId() == R.id.kemeja5) {
            Intent CardViewKelima = new Intent(KeduaActivity.this, TeksActivity.class);
            String Nama1 = "Otsky Kemeja Pria Kualitas Premium Lengan Pendek";
            String Deskripsi1 = "Perfect healing partner! NAKA Cuban Shirt dengan cuttingan yang loose dan potongan leher yang rendah membuat sirkulasi udara menjadi lebih leluasa dan memberikan sensasi sejuk.\n" +
                    "\n" +
                    "Dengan menggunakan bahan “Brushed Cotton Poplin” yang lembut, halus, dan ringan, namun tetap memberikan “shape” yang bagus untuk badan, memberikan kenyamanan ekstra namun tetap stylish.\n" +
                    "\n" +
                    "Breeze\n" +
                    "Extremely soft\n" +
                    "Doesn’t wrinkle easily\n" +
                    "\n" +
                    "\n" +
                    "Material: Brushed Cotton Poplin\n" +
                    "Cutting: Oversized\n" +
                    "\n"  +
                    "Weight: 215gr\n" +
                    "\n" +
                    "On model :\n" +
                    "TB/BB: 186 cm/72 kg\n" +
                    "Size: XL (oversized)\n" +
                    "Link : https://shopee.co.id/Otsky-Kemeja-Pria-Kualitas-Premium-Lengan-Pendek-Basic-i.9564053.19700315659?sp_atk=7589d009-3bf1-4304-9b93-c62c82b717f4&xptdk=7589d009-3bf1-4304-9b93-c62c82b717f4";
            String Harga1 = "Harga : Rp. 500.000 ";

            CardViewKelima.putExtra("Gambar", R.drawable.najuhijau);
            CardViewKelima.putExtra("Nama", Nama1);
            CardViewKelima.putExtra("Deskripsi", Deskripsi1);
            CardViewKelima.putExtra("Harga", Harga1);
            startActivity(CardViewKelima);
        }
    }
}