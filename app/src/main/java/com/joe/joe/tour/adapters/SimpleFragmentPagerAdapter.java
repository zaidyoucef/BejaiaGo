package com.joe.joe.tour.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.joe.joe.tour.R;
import com.joe.joe.tour.fragments.MonumentsFragment;
import com.joe.joe.tour.fragments.PlacesFragment;
import com.joe.joe.tour.fragments.NatureFragment;
import com.joe.joe.tour.fragments.PlagesFragment;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private final Context context;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_places);
        } else if (position == 1) {
            return context.getString(R.string.category_monuments);
        } else if (position == 2) {
            return context.getString(R.string.category_plages);
        } else {
            return context.getString(R.string.category_nature);
        }
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlacesFragment();
        } else if (position == 1) {
            return new MonumentsFragment();
        } else if (position == 2) {
            return new PlagesFragment();
        } else {
            return new NatureFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
