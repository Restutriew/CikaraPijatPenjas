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
        getSupportActionBar().setTitle("Home");

        CircleMenu circleMenu = findViewById(R.id.circle_menu);

        circleMenu.setMainMenu(Color.parseColor("#000000"), R.drawable.icon_menu, R.drawable.icon_cancel)
                .addSubMenu(Color.parseColor("#30A400"), R.drawable.icon_massage)
                .addSubMenu(Color.parseColor("#03DAC5"), R.drawable.icon_benefit)
                .addSubMenu(Color.parseColor("#ffa000"), R.drawable.icon_preparation)
                .addSubMenu(Color.parseColor("#FFFB4A4A"), R.drawable.icon_manipulation)
                .addSubMenu(Color.parseColor("#FF5722"), R.drawable.icon_tutorial)
                .addSubMenu(Color.parseColor("#673AB7"), R.drawable.icon_about)
                .addSubMenu(Color.parseColor("#258CFF"), R.drawable.icon_anatomi)

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
                        Intent massageSportIntent = new Intent(MainActivity.this, MassageSportActivity.class);
                        startActivity(massageSportIntent);
                        break;
                    case 1:
                        indexitem = -1;
                        //do something
                        Intent massageBenefitIntent = new Intent(MainActivity.this,MassageBenefitActivity.class);
                        startActivity(massageBenefitIntent);
                        break;
                    case 2:
                        indexitem = -1;
                        //do something
                        Intent massagePrepationIntent = new Intent(MainActivity.this, MassagePreparationActivity.class);
                        startActivity(massagePrepationIntent);
                        break;
                    case 3:
                        indexitem = -1;
                        //do something
                            Intent massageManipulationIntent = new Intent(MainActivity.this, MassageManipulationActivity.class);
                        startActivity(massageManipulationIntent);
                        break;
                    case 4:
                        indexitem = -1;
                        //do something
                        Intent tutorialIntent = new Intent(MainActivity.this, TutorialActivity.class);
                        startActivity(tutorialIntent);
                        break;
                    case 5:
                        indexitem = -1;
                        //do something
                        Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                        startActivity(aboutIntent);
                        break;
                    case 6:
                        indexitem = -1;
                        //do something
                        Intent anatomiIntent = new Intent(MainActivity.this, AnatomyActivity.class);
                        startActivity(anatomiIntent);
                        break;
                }
            }
        });

    }
}
