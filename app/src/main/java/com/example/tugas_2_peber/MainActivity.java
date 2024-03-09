package com.example.tugas_2_peber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton tombolkemeja = findViewById(R.id.TombolKemeja);
        ImageButton tombolcelana = findViewById(R.id.TombolCelana);
        ImageButton tombolsepatu = findViewById(R.id.TombolSepatu);

        tombolkemeja.setOnClickListener(this);
        tombolcelana.setOnClickListener(this);
        tombolsepatu.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.TombolKemeja) {
            Intent CardViewPertama = new Intent(MainActivity.this, KeduaActivity.class);
            startActivity(CardViewPertama);
        } else if(v.getId() == R.id.TombolCelana) {
            Intent CardViewKedua = new Intent(MainActivity.this, KetigaActivity.class);
            startActivity(CardViewKedua);
        } else if (v.getId() == R.id.TombolSepatu) {
            Intent CardViewKetiga = new Intent(MainActivity.this, KeempatActivity.class);
            startActivity(CardViewKetiga);
        }
    }
}