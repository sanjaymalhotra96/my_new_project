package com.example.mynewproject.writing;


import android.content.Context;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;


public class WritingPagerAdaptor   extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public WritingPagerAdaptor(WritingActivity writingActivity, androidx.fragment.app.FragmentManager  supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        myContext = myContext;
        this.totalTabs = tabCount;

    }




    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
               Wr1 wr1 = new Wr1();
                return wr1;
            case 1:
                Wr2 wr2 = new Wr2();
                return wr2;
            case 2:
                Wr3 wr3 = new Wr3();
                return wr3;

            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
    }



