package com.example.avion.labo6;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class PlanetViewPagerAdapter extends FragmentPagerAdapter{
    List<String> tittleList;
    List<Fragment> fragmentList;

    public PlanetViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    public void addItem(String title, Fragment fragment){
        tittleList.add(title);
        fragmentList.add(fragment);
    }
}
