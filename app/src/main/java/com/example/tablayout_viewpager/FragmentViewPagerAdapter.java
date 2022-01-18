package com.example.tablayout_viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentViewPagerAdapter extends FragmentStatePagerAdapter {
    int mNumberOfPages;
    public FragmentViewPagerAdapter(@NonNull FragmentManager fm, int mNumberOfPages) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        
        this.mNumberOfPages = mNumberOfPages;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return PagerFragment.newInstance("Fragment "+position);
    }

    @Override
    public int getCount() {
        return mNumberOfPages;
    }
}
