package com.example.fadhlanalhirzi.mfadhlanalhirzi_1202144021_modul4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void daftarNama(View view) {
        Intent a = new Intent(MainActivity.this,DaftarNama.class);
        startActivity(a);
    }

    public void pencarianGambar(View view) {
        Intent b = new Intent(MainActivity.this,PencarianGambar.class);
        startActivity(b);
    }
}