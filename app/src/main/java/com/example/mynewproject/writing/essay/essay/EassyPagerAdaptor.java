package com.example.mynewproject.writing.essay.essay;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



public class EassyPagerAdaptor extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public EassyPagerAdaptor(EssayActivity essayActivity, FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        myContext = myContext;
        this.totalTabs = tabCount;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Essy1 essy1 = new Essy1();
                return essy1;
            case 1:
                Essy2 essy2 = new Essy2();
                return essy2;
            case 2:
                Essy3 essy3 = new Essy3();
                return essy3;

            case 3:
                Essy4 essy4 = new Essy4();
                return essy4;

            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}
