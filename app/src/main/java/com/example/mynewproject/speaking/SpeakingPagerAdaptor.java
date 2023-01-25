package com.example.mynewproject.speaking;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mynewproject.writing.Wr1;
import com.example.mynewproject.writing.Wr2;
import com.example.mynewproject.writing.Wr3;
import com.example.mynewproject.writing.WritingActivity;

public class SpeakingPagerAdaptor   extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public SpeakingPagerAdaptor(SpeakingActivity speakingActivity, FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        myContext = myContext;
        this.totalTabs = tabCount;

    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Speaking1 sp1 = new Speaking1();
                return sp1;
            case 1:
                Speaking2 sp2 = new Speaking2();
                return sp2;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

}