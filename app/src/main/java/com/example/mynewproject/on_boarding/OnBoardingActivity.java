package com.example.mynewproject.on_boarding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.mynewproject.R;
import com.google.android.material.tabs.TabLayout;

import me.relex.circleindicator.CircleIndicator3;

public class OnBoardingActivity extends AppCompatActivity {
    ViewPager2 viewpager;
    CircleIndicator3 indicator;
    MyAdaptor2 myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

       viewpager =findViewById(R.id.viewpager);
       indicator =findViewById(R.id.indicator);
        myAdapter = new MyAdaptor2(getSupportFragmentManager(), getLifecycle());

        // add Fragments in your ViewPagerFragmentAdapter class
        myAdapter.addFragment(new OnBoarding1());
        myAdapter.addFragment(new OnBoarding2());
        myAdapter.addFragment(new OnBoarding3());

        viewpager.setAdapter(myAdapter);

        indicator.createIndicators(2,0);
        indicator.setViewPager(viewpager);




    }
}