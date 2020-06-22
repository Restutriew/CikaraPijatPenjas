package com.cikarastudio.cikarapijatpenjas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.cikarastudio.cikarapijatpenjas.R;

public class SplashActivity extends AppCompatActivity {
    private int loadingTime = 4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke intro activity
                Intent home = new Intent(SplashActivity.this, IntroActivity.class);
                startActivity(home);
                finish();

            }
        }, loadingTime);
    }

}

