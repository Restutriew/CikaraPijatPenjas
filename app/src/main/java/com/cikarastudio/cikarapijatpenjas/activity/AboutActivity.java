package com.cikarastudio.cikarapijatpenjas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cikarastudio.cikarapijatpenjas.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setTitle("Tentang Aplikasi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
