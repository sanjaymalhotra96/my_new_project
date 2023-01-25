package com.example.mynewproject.activities;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mynewproject.listening.Listening;
import com.example.mynewproject.listening.Lt1;
import com.example.mynewproject.listening.Lt2;
import com.example.mynewproject.listening.Lt3;

public class VedioViewPagerAdaptor extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public VedioViewPagerAdaptor(VedioViewActivity vedioViewActivity, FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        myContext = myContext;
        this.totalTabs = tabCount;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Vv1 Vv1 = new Vv1();
                return Vv1;
            case 1:
                Vv2 Vv2 = new Vv2();
                return Vv2;

            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}
