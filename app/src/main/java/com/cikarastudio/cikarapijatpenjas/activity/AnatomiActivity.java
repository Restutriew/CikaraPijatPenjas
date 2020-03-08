package com.cikarastudio.cikarapijatpenjas.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.cikarastudio.cikarapijatpenjas.R;
import com.cikarastudio.cikarapijatpenjas.adapter.ViewPagerAdapter;
import com.cikarastudio.cikarapijatpenjas.fragment.AnatomiBackFragment;
import com.cikarastudio.cikarapijatpenjas.fragment.AnatomiFrontFragment;

import java.util.ArrayList;
import java.util.List;

public class AnatomiActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private PagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anatomi);

        List<Fragment> list = new ArrayList<>();
        list.add(new AnatomiFrontFragment());
        list.add(new AnatomiBackFragment());

        viewPager = findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),list);

        viewPager.setAdapter(viewPagerAdapter);

    }
}
