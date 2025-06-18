package com.example.bai4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MuseumsPagerAdapter extends FragmentStateAdapter {

    public MuseumsPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new MuseumUSAFragment();
            case 1:
                return new MuseumUKFragment();
            case 2:
                return new MuseumItalyFragment();
            default:
                return new MuseumUSAFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
