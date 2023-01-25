package com.example.mynewproject.writing.graphs.graphs;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mynewproject.writing.essay.essay.EssayActivity;
import com.example.mynewproject.writing.essay.essay.Essy1;
import com.example.mynewproject.writing.essay.essay.Essy2;
import com.example.mynewproject.writing.essay.essay.Essy3;
import com.example.mynewproject.writing.essay.essay.Essy4;

public class GraphsPagerAdaptor extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public GraphsPagerAdaptor(GraphsActivity graphsActivity, FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        myContext = myContext;
        this.totalTabs = tabCount;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Graphs1 graphs1 = new Graphs1();
                return graphs1;
            case 1:
                Graphs2 graphs2= new Graphs2();
                return graphs2;
            case 2:
                Graphs3 graphs3 = new Graphs3();
                return graphs3;

            case 3:
                Graphs4 graphs4 = new Graphs4();
                return graphs4;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}
