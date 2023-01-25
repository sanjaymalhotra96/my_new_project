package com.example.mynewproject.complete_profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.mynewproject.R;

public class CPActivity extends AppCompatActivity {

    ViewPager2 viewpager;
    CPPagerAdaptor completProfileAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);
        viewpager =findViewById(R.id.viewpager2);
        completProfileAdaptor = new CPPagerAdaptor(getSupportFragmentManager(), getLifecycle());

        // add Fragments in your ViewPagerFragmentAdapter class
        completProfileAdaptor.addFragment(new CP1());
        completProfileAdaptor.addFragment(new CP2());
        completProfileAdaptor.addFragment(new CP3());
        completProfileAdaptor.addFragment(new CP4());
        completProfileAdaptor.addFragment(new CP5());
        completProfileAdaptor.addFragment(new CP6());

        viewpager.setAdapter(completProfileAdaptor);
    }
}