package com.example.tugas_2_peber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;



public class TeksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_teks);

        String tvnama = getIntent().getStringExtra("Nama");
        String tvdesc = getIntent().getStringExtra("Deskripsi");
        String tvharga = getIntent().getStringExtra("Harga");
        int imageResource = getIntent().getIntExtra("Gambar", 0);

        TextView tvNama = findViewById(R.id.Nama);
        TextView tvDesc = findViewById(R.id.Deskripsi);
        TextView tvHarga = findViewById(R.id.tvharga);
        ImageView imageView = findViewById(R.id.imageView);

        tvNama.setText(tvnama);
        tvDesc.setText(tvdesc);
        tvHarga.setText(tvharga);
        imageView.setImageResource(imageResource);

        Button btnshare = findViewById(R.id.TombolKirim);

        btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvnama + "\n" + tvdesc + "\n" + "Harga :" + tvharga;
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, text);
                startActivity(Intent.createChooser(shareIntent, "Bagikan With"));
            }
        });
    }
}