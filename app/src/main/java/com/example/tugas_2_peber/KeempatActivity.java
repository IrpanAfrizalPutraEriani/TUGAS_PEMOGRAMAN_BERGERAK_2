package com.example.tugas_2_peber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class KeempatActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keempat);

        CardView Sepatu1 = findViewById(R.id.sepatu1);
        CardView Sepatu2 = findViewById(R.id.sepatu2);
        CardView Sepatu3 = findViewById(R.id.sepatu3);
        CardView Sepatu4 = findViewById(R.id.sepatu4);
        CardView Sepatu5 = findViewById(R.id.sepatu5);

        Sepatu1.setOnClickListener(this);
        Sepatu2.setOnClickListener(this);
        Sepatu3.setOnClickListener(this);
        Sepatu4.setOnClickListener(this);
        Sepatu5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.sepatu1) {
            Intent CardViewPertama = new Intent(KeempatActivity.this, TeksActivity.class);
            String Nama1 = "Sepatu Vans Autenthic black and white";
            String Deskripsi1 = "Description:\n" +
                    "A low profile, slip-on shoe, the Vans Classic Slip-On has elastic side accents and padded collars for extra comfort. It also features the Vans flag label and signature waffle outsoles for firmer grip.\n" +
                    "Composition:100% Canvas\n" +
                    "The materials used in the manufacturing of these styles (including adhesives) are free of any animal by-products and therefore are 100% vegan.\n" +
                    "\n" +
                    "Size available :\n" +
                    "Pls Ask before you make a purchasement :))\n" +
                    "\n" +
                    "#VANS#VANSINDONESIA#AUTHORIZED#Skate\n" +
                    "\n" +
                    "Product Vans yang kami jual  100% Original Global Market (karena kami authorized dealer Vans Indo). Bukan Black Market, Grey Market, Japan Market, Swedish Market, Croatian Market. \n" +
                    "\n" +
                    "Semua size yang kami cantumkan dalam US MENS (mohon diperhatikan lagi)\n"+
                    "Link : https://shopee.co.id/Vans-Sepatu-Classic-Slip-On-Black-White-i.87216194.2887729979?sp_atk=0bf1aefd-d174-4646-8953-7b928f9936da&xptdk=0bf1aefd-d174-4646-8953-7b928f9936da";
            String Harga1 = "Harga : Rp. 1.500.000 ";

            CardViewPertama.putExtra("Gambar", R.drawable.vansbw);
            CardViewPertama.putExtra("Nama", Nama1);
            CardViewPertama.putExtra("Deskripsi", Deskripsi1);
            CardViewPertama.putExtra("Harga", Harga1);
            startActivity(CardViewPertama);
        } else if (v.getId() == R.id.sepatu2) {
            Intent CardViewKedua = new Intent(KeempatActivity.this, TeksActivity.class);
            String Nama2= "Sepatu Vans Berle Pro Grey Black casual";
            String Deskripsi2 = "Spesifikasi :\n" +
                    "• Low Cut\n" +
                    "• Material kombinasi suede dan canvas\n" +
                    "• Terdapat ornament tali dengan material cotton di area upper\n" +
                    "• Midsole rubber bertekstur kulit jeruk\n" +
                    "• Insole heva rubber (dapat di lepas-pasang)\n" +
                    "• Label Thunder\n" +
                    "• Single foxing\n" +
                    "• Outsole berwarna kuning dengan cap petir dan logo Thunder\n" +
                    "• Proses vulkanisir\n" +
                    "• Buatan Indonesia\n" +
                    "\n" +
                    "Panduan ukuran :\n" +
                    "\n" +
                    "• Size 36 = 23cm\n" +
                    "• Size 37 = 23.5 cm\n" +
                    "• Size 38 = 24 cm\n" +
                    "• Size 39 = 25 cm\n" +
                    "• Size 40 = 25.5 cm\n" +
                    "• Size 41 = 26.5 cm\n" +
                    "• Size 42 = 27 cm\n" +
                    "• Size 43 = 28 cm\n" +
                    "\n" +
                    "READY STOCK BURUAN DIORDER SEBELUM KEHABISAN!\n" +
                    "Kondisi Baru / New - 100% ORIGINAL from Thunderbear\n" +
                    "Kelengkapan Packing BOX\n"+
                    "Link : https://www.tokopedia.com/ncrsport/sepatu-sneakers-vans-original-berle-pro-surplus-black-vn0a3wkx0qg-7-39?extParam=ivf%3Dfalse%26src%3Dsearch&refined=true";
            String Harga2 = "Harga : Rp. 1.900.000 ";

            CardViewKedua.putExtra("Gambar", R.drawable.vansputih);
            CardViewKedua.putExtra("Nama", Nama2);
            CardViewKedua.putExtra("Deskripsi", Deskripsi2);
            CardViewKedua.putExtra("Harga", Harga2);
            startActivity(CardViewKedua);
        } else if (v.getId() == R.id.sepatu3) {
            Intent CardViewKetiga = new Intent(KeempatActivity.this, TeksActivity.class);
            String Nama3 = "Sepatu Vans | Vans X Stranger Things Authentic";
            String Deskripsi3 = "Condition and Quality:\n" +
                    "•100% BRAND NEW INBOX (BNIB) Tag (BNWT)\n" +
                    "•100% Authentic Global Release (Bukan MAP)\n" +
                    "•100% Trustted Since 2016\n" +
                    "\n" +
                    "________________________________________\n" +
                    "Vans Style 36 x Stranger Things\n" +
                    "________________________________________\n" +
                    "*Pola Size (UK,US,CM)Tiap sepatu/serries berbeda beda baiknya tanyakan ke *\n" +
                    "\n" +
                    "Available Size :\n" +
                    "EUR 38 //\n" +
                    "EUR 39 //\n" +
                    "EUR 40 //\n" +
                    "EUR 41 //\n" +
                    "EUR 42 //\n" +
                    "EUR 43 //\n" +
                    "EUR 44 //\n"+
                    "Link : https://www.tokopedia.com/alloriginalsstore/sepatu-vans-authentic-x-stranger-things-men-s-original?extParam=ivf%3Dfalse%26src%3Dsearch&refined=true";
            String Harga3 = "Harga : Rp. 1.700.000 ";

            CardViewKetiga.putExtra("Gambar", R.drawable.vanssrtager);
            CardViewKetiga.putExtra("Nama", Nama3);
            CardViewKetiga.putExtra("Deskripsi", Deskripsi3);
            CardViewKetiga.putExtra("Harga", Harga3);
            startActivity(CardViewKetiga);
        } else if (v.getId() == R.id.sepatu4) {
            Intent CardViewKeempat = new Intent(KeempatActivity.this, TeksActivity.class);
            String Nama4 = "Sepatu vans |   mn chima pro 2";
            String Deskripsi4 = "Vans MN Chima Pro 2 Mens Sneakers Shoes - Black/Alpine\n" +
                    "\n" +
                    "• Sneakers shoes\n" +
                    "• Material : Suade/Canvas\n" +
                    "• 100% Original PT Navya Retail Indonesia\n" +
                    "\n" +
                    "Ready Size :\n" +
                    "\n" +
                    "• Size US 7 (39) Panjang : 25 cm\n" +
                    "• Size US 8 (40.5) Panjang : 26 cm\n" +
                    "• Size US 9 (42) Panjang : 27 cm\n" +
                    "• Size US 10 (43) Panjang : 28 cm\n" +
                    "• Size US 11 (44.5) Panjang : 29 cm\n" +
                    "• Size US 12 (46) Panjang : 30 cm\n" +
                    "\n" +
                    "- Harap konfirmasi ketersediaan produk\n" +
                    "- Cantumkan pilihan size dikolom catatan\n" +
                    "- Packing + Bubble warp\n"+
                    "Link : https://www.tokopedia.com/dcshoes/vans-mn-chima-pro-2-mens-sneakers-shoes-black-alpine?extParam=ivf%3Dfalse%26src%3Dsearch";
            String Harga4 = "Harga : Rp. 1.500.000 ";

            CardViewKeempat.putExtra("Gambar", R.drawable.vanschima);
            CardViewKeempat.putExtra("Nama", Nama4);
            CardViewKeempat.putExtra("Deskripsi", Deskripsi4);
            CardViewKeempat.putExtra("Harga", Harga4);
            startActivity(CardViewKeempat);
        } else if (v.getId() == R.id.sepatu5) {
            Intent CardViewKelima = new Intent(KeempatActivity.this, TeksActivity.class);
            String Nama5 = "Sepatu Vans |ComfyCush Old Skool";
            String Deskripsi5 = "Vans Old Skool Black White Classic\n" +
                    "ORIGINAL 100%\n" +
                    "Global Release\n" +
                    "\n" +
                    "SIZE\n" +
                    "US 4 // EUR 35 // 22cm\n" +
                    "US 4.5 // EUR 36 // 22.5cm\n" +
                    "US 5 // EUR 36.5 // 23cm\n" +
                    "US5.5 // EUR 37 // 23.5cm\n" +
                    "US 6 // EUR 38 // 24cm\n" +
                    "US 6.5 // EUR 38.5 // 24.5cm\n" +
                    "US 7 // EUR 39 // 25cm\n" +
                    "US 7.5 // EUR 40 // 25.5cm\n" +
                    "US 8 // EUR 40.5 // 26cm\n" +
                    "US 8.5 // EUR 41 // 26.5cm\n" +
                    "US 9 // EUR 42 // 27cm\n" +
                    "US 9.5 // EUR 42.5 // 27.5cm\n" +
                    "US 10 // EUR 43 // 28cm\n" +
                    "US 10.5 // EUR 44 // 28.5cm\n" +
                    "US 11 // EUR 44.5 // 29cm\n" +
                    "US 11.5 // EUR 45 // 29.5cm\n" +
                    "US 12 // EUR 46 // 30cm\n" +
                    "US 12.5 // EUR 47 // 31cm"+
                    "Link :https://www.tokopedia.com/vansoriginal/vans-old-skool-black-white-classic-original-40" ;
            String Harga5 = "Harga : Rp. 1.600.000 ";

            CardViewKelima.putExtra("Gambar", R.drawable.vansold);
            CardViewKelima.putExtra("Nama", Nama5);
            CardViewKelima.putExtra("Deskripsi", Deskripsi5);
            CardViewKelima.putExtra("Harga", Harga5);
            startActivity(CardViewKelima);
        }
    }
}