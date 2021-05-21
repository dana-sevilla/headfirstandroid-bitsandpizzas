package com.drbs.bitsandpizzas;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    Context context;

    public SectionsPagerAdapter(FragmentManager fm, int behavior, Context context) {
        super(fm, behavior);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TopFragment();
            case 1:
                return new PizzaFragment();
            case 2:
                return new PastaFragment();
            case 3:
                return new StoresFragment();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getResources().getText(R.string.home_tab);
            case 1:
                return context.getResources().getText(R.string.pizza_tab);
            case 2:
                return context.getResources().getText(R.string.pasta_tab);
            case 3:
                return context.getResources().getText(R.string.store_tab);
        }
        return null;
    }
}
