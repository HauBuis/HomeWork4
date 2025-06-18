package com.example.bai4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class WondersPagerAdapter extends FragmentStateAdapter {

    public WondersPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new WonderUSAFragment(); // 🇺🇸
            case 1:
                return new WonderUKFragment(); // 🇬🇧
            case 2:
                return new WonderItalyFragment(); // 🇮🇹
            default:
                return new WonderUSAFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
