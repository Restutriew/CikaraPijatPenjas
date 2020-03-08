package com.cikarastudio.cikarapijatpenjas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.cikarastudio.cikarapijatpenjas.R;
import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;


public class MainActivity extends AppCompatActivity {

    private int indexitem = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CircleMenu circleMenu = findViewById(R.id.circle_menu);

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.drawable.icon_menu, R.drawable.icon_cancel)
                .addSubMenu(Color.parseColor("#258CFF"), R.drawable.icon_anatomi)
                .addSubMenu(Color.parseColor("#30A400"), R.drawable.icon_massage)
                .addSubMenu(Color.parseColor("#03DAC5"), R.drawable.icon_massage)
                .addSubMenu(Color.parseColor("#3700B3"), R.drawable.icon_massage)
                .addSubMenu(Color.parseColor("#6200EE"), R.drawable.icon_massage)
                .addSubMenu(Color.parseColor("#FF5722"), R.drawable.icon_massage)
                .addSubMenu(Color.parseColor("#FFEB3B"), R.drawable.icon_massage)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {

                    @Override
                    public void onMenuSelected(int index) {
                        indexitem = index;
                    }
                }).setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

            @Override
            public void onMenuOpened() {
            }

            @Override
            public void onMenuClosed() {
                switch (indexitem) {
                    case 0:
                        indexitem = -1;
                        Intent intent = new Intent(MainActivity.this, AnatomiActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        indexitem = -1;
                        //do something
                        break;
                    case 2:
                        indexitem = -1;
                        //do something
                        break;
                }
            }
        });

    }
}
