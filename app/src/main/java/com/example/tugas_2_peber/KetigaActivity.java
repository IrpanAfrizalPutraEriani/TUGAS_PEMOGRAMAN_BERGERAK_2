package com.example.tugas_2_peber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class KetigaActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketiga);

        CardView celana1 = findViewById(R.id.Celana1);
        CardView celana2 = findViewById(R.id.Celana2);
        CardView celana3 = findViewById(R.id.Celana3);
        CardView celana4 = findViewById(R.id.Celana4);
        CardView celana5 = findViewById(R.id.Celana5);

        celana1.setOnClickListener(this);
        celana2.setOnClickListener(this);
        celana3.setOnClickListener(this);
        celana4.setOnClickListener(this);
        celana5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.Celana1) {
            Intent CardViewPertama = new Intent(KetigaActivity.this, TeksActivity.class);
            String Nama1 = "Celana Jeans Pria Long Pants Black Original";
            String Deskripsi1 = "Spesifikasi :\n" +
                    "Badjatex Denim Ketebalan 12,5 Oz \n" +
                    "1. Material    = Jeans Stretch (Melar) \n" +
                    "2. Warna       = All Variant\n" +
                    "3. Cutting     = Slim Fit\n" +
                    "4. Tag Label = Kulit\n" +
                    "5. kancing    = Besi\n" +
                    "\n" +
                    "S  =  Lingkar Pinggang : 74 cm | Panjang : ±98 cm | Lebar Paha : 25 cm | Lebar Kaki : 15 cm\n" +
                    "M = Lingkar Pinggang : 78 cm | Panjang : ±99 cm | Lebar Paha : 26 cm | Lebar Kaki : 15.5 cm\n" +
                    "L  = Lingkar Pinggang : 82 cm | Panjang : ±100 cm | Lebar Paha : 27 cm | Lebar Kaki : 16 cm\n" +
                    "XL= Lingkar Pinggang : 86 cm | Panjang : ±101 cm | Lebar Paha : 28 cm | Lebar Kaki : 16.5 cm\n" +
                    "ukuran yang cari size XXL. XXXL silahkan dicari di etalase kami dengan nama BIGSIZE: \n"+
                    "https://shopee.co.id/AlfheimCloth.Inc-Celana-Jeans-Pria-Long-Pants-Denim-Slim-Fit-Pria-Bahan-BADJATEX-Dark-Navy-Snowgrey-Blitz-Soft-Blitz-Black-Denim-S-M-L-XL-i.80947441.16411689859?sp_atk=47116bb1-0a34-46ec-ba8b-d6175b3b40e6&xptdk=47116bb1-0a34-46ec-ba8b-d6175b3b40e6";
            String Harga1 = "Harga : Rp. 700.000 ";

            CardViewPertama.putExtra("Gambar", R.drawable.jeanshitam);
            CardViewPertama.putExtra("Nama", Nama1);
            CardViewPertama.putExtra("Deskripsi", Deskripsi1);
            CardViewPertama.putExtra("Harga", Harga1);
            startActivity(CardViewPertama);
        } else if (v.getId() == R.id.Celana2) {
            Intent CardViewKedua = new Intent(KetigaActivity.this, TeksActivity.class);
            String Nama2 = "Celana Jeans Pria Long Pants Denim SnowGrey";
            String Deskripsi1 = "Spesifikasi :\n" +
                    "Badjatex Denim Ketebalan 12,5 Oz \n" +
                    "1. Material    = Jeans Stretch (Melar) \n" +
                    "2. Warna       = All Variant\n" +
                    "3. Cutting     = Slim Fit\n" +
                    "4. Tag Label = Kulit\n" +
                    "5. kancing    = Besi\n" +
                    "\n" +
                    "S  =  Lingkar Pinggang : 74 cm | Panjang : ±98 cm | Lebar Paha : 25 cm | Lebar Kaki : 15 cm\n" +
                    "M = Lingkar Pinggang : 78 cm | Panjang : ±99 cm | Lebar Paha : 26 cm | Lebar Kaki : 15.5 cm\n" +
                    "L  = Lingkar Pinggang : 82 cm | Panjang : ±100 cm | Lebar Paha : 27 cm | Lebar Kaki : 16 cm\n" +
                    "XL= Lingkar Pinggang : 86 cm | Panjang : ±101 cm | Lebar Paha : 28 cm | Lebar Kaki : 16.5 cm\n" +
                    "ukuran yang cari size XXL. XXXL silahkan dicari di etalase kami dengan nama BIGSIZE: \n"+
                    "Link : https://shopee.co.id/AlfheimCloth.Inc-Celana-Jeans-Pria-Long-Pants-Denim-Slim-Fit-Pria-Bahan-BADJATEX-Dark-Navy-Snowgrey-Blitz-Soft-Blitz-Black-Denim-S-M-L-XL-i.80947441.16411689859?sp_atk=47116bb1-0a34-46ec-ba8b-d6175b3b40e6&xptdk=47116bb1-0a34-46ec-ba8b-d6175b3b40e6";
            String Harga1 = "Harga : Rp. 700.000 ";

            CardViewKedua.putExtra("Gambar", R.drawable.jeanssnow);
            CardViewKedua.putExtra("Nama", Nama2);
            CardViewKedua.putExtra("Deskripsi", Deskripsi1);
            CardViewKedua.putExtra("Harga", Harga1);
            startActivity(CardViewKedua);
        } else if (v.getId() == R.id.Celana3) {
            Intent CardViewKetiga = new Intent(KetigaActivity.this, TeksActivity.class);
            String Nama3 = "Celana Jeans Pria Long Pants Denim Black Waching";
            String Deskripsi1 = "Spesifikasi :\n" +
                    "Badjatex Denim Ketebalan 12,5 Oz \n" +
                    "1. Material    = Jeans Stretch (Melar) \n" +
                    "2. Warna       = All Variant\n" +
                    "3. Cutting     = Slim Fit\n" +
                    "4. Tag Label = Kulit\n" +
                    "5. kancing    = Besi\n" +
                    "\n" +
                    "S  =  Lingkar Pinggang : 74 cm | Panjang : ±98 cm | Lebar Paha : 25 cm | Lebar Kaki : 15 cm\n" +
                    "M = Lingkar Pinggang : 78 cm | Panjang : ±99 cm | Lebar Paha : 26 cm | Lebar Kaki : 15.5 cm\n" +
                    "L  = Lingkar Pinggang : 82 cm | Panjang : ±100 cm | Lebar Paha : 27 cm | Lebar Kaki : 16 cm\n" +
                    "XL= Lingkar Pinggang : 86 cm | Panjang : ±101 cm | Lebar Paha : 28 cm | Lebar Kaki : 16.5 cm\n" +
                    "ukuran yang cari size XXL. XXXL silahkan dicari di etalase kami dengan nama BIGSIZE: \n"+
                    "Link : https://shopee.co.id/AlfheimCloth.Inc-Celana-Jeans-Pria-Long-Pants-Denim-Slim-Fit-Pria-Bahan-BADJATEX-Dark-Navy-Snowgrey-Blitz-Soft-Blitz-Black-Denim-S-M-L-XL-i.80947441.16411689859?sp_atk=47116bb1-0a34-46ec-ba8b-d6175b3b40e6&xptdk=47116bb1-0a34-46ec-ba8b-d6175b3b40e6";
            String Harga1 = "Harga : Rp. 700.000 ";

            CardViewKetiga.putExtra("Gambar", R.drawable.jeansblackwahing);
            CardViewKetiga.putExtra("Nama", Nama3);
            CardViewKetiga.putExtra("Deskripsi", Deskripsi1);
            CardViewKetiga.putExtra("Harga", Harga1);
            startActivity(CardViewKetiga);
        } else if (v.getId() == R.id.Celana4) {
            Intent CardViewKeempat = new Intent(KetigaActivity.this, TeksActivity.class);
            String Nama4 = "Celana Jeans Pria Long Pants Denim Soft Blue";
            String Deskripsi1 = "Spesifikasi :\n" +
                    "Badjatex Denim Ketebalan 12,5 Oz \n" +
                    "1. Material    = Jeans Stretch (Melar) \n" +
                    "2. Warna       = All Variant\n" +
                    "3. Cutting     = Slim Fit\n" +
                    "4. Tag Label = Kulit\n" +
                    "5. kancing    = Besi\n" +
                    "\n" +
                    "Size : S, M, L, XL, \n" +
                    "\n" +
                    "S  =  Lingkar Pinggang : 74 cm | Panjang : ±98 cm | Lebar Paha : 25 cm | Lebar Kaki : 15 cm\n" +
                    "M = Lingkar Pinggang : 78 cm | Panjang : ±99 cm | Lebar Paha : 26 cm | Lebar Kaki : 15.5 cm\n" +
                    "L  = Lingkar Pinggang : 82 cm | Panjang : ±100 cm | Lebar Paha : 27 cm | Lebar Kaki : 16 cm\n" +
                    "XL= Lingkar Pinggang : 86 cm | Panjang : ±101 cm | Lebar Paha : 28 cm | Lebar Kaki : 16.5 cm\n" +
                    "ukuran yang cari size XXL. XXXL silahkan dicari di etalase kami dengan nama BIGSIZE: \n"+
                    "Link : https://shopee.co.id/AlfheimCloth.Inc-Celana-Jeans-Pria-Long-Pants-Denim-Slim-Fit-Pria-Bahan-BADJATEX-Dark-Navy-Snowgrey-Blitz-Soft-Blitz-Black-Denim-S-M-L-XL-i.80947441.16411689859?sp_atk=47116bb1-0a34-46ec-ba8b-d6175b3b40e6&xptdk=47116bb1-0a34-46ec-ba8b-d6175b3b40e6";
            String Harga1 = "Harga : Rp. 700.000 ";

            CardViewKeempat.putExtra("Gambar", R.drawable.jeansblue);
            CardViewKeempat.putExtra("Nama", Nama4);
            CardViewKeempat.putExtra("Deskripsi", Deskripsi1);
            CardViewKeempat.putExtra("Harga", Harga1);
            startActivity(CardViewKeempat);
        } else if (v.getId() == R.id.Celana5) {
            Intent CardViewKelima = new Intent(KetigaActivity.this, TeksActivity.class);
            String Nama5 = "Celana Jeans Pria Long Pants Denim Aqua Blue";
            String Deskripsi1 = "Spesifikasi :\n" +
                    "Badjatex Denim Ketebalan 12,5 Oz \n" +
                    "1. Material    = Jeans Stretch (Melar) \n" +
                    "2. Warna       = All Variant\n" +
                    "3. Cutting     = Slim Fit\n" +
                    "4. Tag Label = Kulit\n" +
                    "5. kancing    = Besi\n" +
                    "\n" +
                    "Size : S, M, L, XL, \n" +
                    "\n" +
                    "S  =  Lingkar Pinggang : 74 cm | Panjang : ±98 cm | Lebar Paha : 25 cm | Lebar Kaki : 15 cm\n" +
                    "M = Lingkar Pinggang : 78 cm | Panjang : ±99 cm | Lebar Paha : 26 cm | Lebar Kaki : 15.5 cm\n" +
                    "L  = Lingkar Pinggang : 82 cm | Panjang : ±100 cm | Lebar Paha : 27 cm | Lebar Kaki : 16 cm\n" +
                    "XL= Lingkar Pinggang : 86 cm | Panjang : ±101 cm | Lebar Paha : 28 cm | Lebar Kaki : 16.5 cm\n" +
                    "ukuran yang cari size XXL. XXXL silahkan dicari di etalase kami dengan nama BIGSIZE: \n"+
                    "Link : https://shopee.co.id/AlfheimCloth.Inc-Celana-Jeans-Pria-Long-Pants-Denim-Slim-Fit-Pria-Bahan-BADJATEX-Dark-Navy-Snowgrey-Blitz-Soft-Blitz-Black-Denim-S-M-L-XL-i.80947441.16411689859?sp_atk=47116bb1-0a34-46ec-ba8b-d6175b3b40e6&xptdk=47116bb1-0a34-46ec-ba8b-d6175b3b40e6";
            String Harga1 = "Harga : Rp. 700.000 ";

            CardViewKelima.putExtra("Gambar", R.drawable.jeansaqua);
            CardViewKelima.putExtra("Nama", Nama5);
            CardViewKelima.putExtra("Deskripsi", Deskripsi1);
            CardViewKelima.putExtra("Harga", Harga1);
            startActivity(CardViewKelima);
        }
    }
}