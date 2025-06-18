package com.example.bai4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class LeadersPagerAdapter extends FragmentStateAdapter {
    public LeadersPagerAdapter(FragmentActivity fa) {
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new ObamaFragment();
            case 1: return new MerkelFragment();
            case 2: return new TrudeauFragment();
            default: return new ObamaFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
