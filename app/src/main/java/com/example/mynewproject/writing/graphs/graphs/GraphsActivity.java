package com.example.mynewproject.writing.graphs.graphs;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.mynewproject.R;
import com.example.mynewproject.writing.essay.essay.EassyPagerAdaptor;
import com.google.android.material.tabs.TabLayout;

public class GraphsActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs2);

        tabLayout=(TabLayout)findViewById(R.id.tabLayout2);
        viewPager=(ViewPager)findViewById(R.id.viewPager2);


        tabLayout.addTab(tabLayout.newTab().setText("Question"));
        tabLayout.addTab(tabLayout.newTab().setText("Your Answer"));
        tabLayout.addTab(tabLayout.newTab().setText("Sample Answer"));
        tabLayout.addTab(tabLayout.newTab().setText("Vocabulary"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final GraphsPagerAdaptor adapter = new GraphsPagerAdaptor(this,getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}