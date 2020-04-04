package com.cikarastudio.cikarapijatpenjas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cikarastudio.cikarapijatpenjas.R;

public class MassageBenefitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massage_benefit);
        getSupportActionBar().setTitle("Manfaat Massage");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
