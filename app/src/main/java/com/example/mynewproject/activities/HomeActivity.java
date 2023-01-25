package com.example.mynewproject.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.example.mynewproject.R;
import com.example.mynewproject.fragments.FragCommunity;
import com.example.mynewproject.fragments.FragExplore;
import com.example.mynewproject.fragments.FragMockTest;
import com.example.mynewproject.fragments.FragPrepare;
import com.example.mynewproject.fragments.FragVideos;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

      bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.explore);

    }

    FragExplore fragExplore = new FragExplore();
    FragPrepare fragPrepare = new FragPrepare();
    FragVideos fragVideos = new FragVideos();
    FragMockTest fragMockTest = new FragMockTest();
    FragCommunity fragCommunity = new FragCommunity();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.explore:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, fragExplore).commit();
                return true;

            case R.id.prepare:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, fragPrepare).commit();
                return true;

            case R.id.videos:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, fragVideos).commit();
                return true;
            case R.id.mock_test:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, fragMockTest).commit();
                return true;
            case R.id.community:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, fragCommunity).commit();
                return true;
        }
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}