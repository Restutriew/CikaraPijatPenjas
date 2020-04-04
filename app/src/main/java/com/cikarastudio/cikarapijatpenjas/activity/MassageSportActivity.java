package com.cikarastudio.cikarapijatpenjas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cikarastudio.cikarapijatpenjas.R;

public class MassageSportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massage);
        getSupportActionBar().setTitle("Massage Olahraga");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
