package com.example.bai4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CountriesPagerAdapter extends FragmentStateAdapter {

    public CountriesPagerAdapter(FragmentActivity activity) {
        super(activity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new USAFragment();
            case 1: return new UKFragment();
            case 2: return new ItalyFragment();
            default: return new USAFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
