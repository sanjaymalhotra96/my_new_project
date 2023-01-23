package com.example.mynewproject.complete_profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.mynewproject.R;
import com.example.mynewproject.on_boarding.MyAdaptor2;
import com.example.mynewproject.on_boarding.OnBoarding1;
import com.example.mynewproject.on_boarding.OnBoarding2;
import com.example.mynewproject.on_boarding.OnBoarding3;

import java.util.ArrayList;

public class CompleteProfile extends AppCompatActivity {

    ViewPager2 viewpager;
    CompletProfileAdaptor completProfileAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);
        viewpager =findViewById(R.id.viewpager2);
        completProfileAdaptor = new CompletProfileAdaptor(getSupportFragmentManager(), getLifecycle());

        // add Fragments in your ViewPagerFragmentAdapter class
        completProfileAdaptor.addFragment(new CompleteProfile1());
        completProfileAdaptor.addFragment(new CompleteProfile2());
        completProfileAdaptor.addFragment(new CompleteProfile3());
        completProfileAdaptor.addFragment(new CompleteProfile4());
        completProfileAdaptor.addFragment(new CompleteProfile5());
        completProfileAdaptor.addFragment(new CompleteProfile6());

        viewpager.setAdapter(completProfileAdaptor);
    }
}