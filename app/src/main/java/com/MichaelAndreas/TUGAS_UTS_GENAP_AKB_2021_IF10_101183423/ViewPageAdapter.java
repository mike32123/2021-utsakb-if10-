package com.MichaelAndreas.TUGAS_UTS_GENAP_AKB_2021_IF10_101183423;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPageAdapter extends FragmentPagerAdapter {
    // 1 Juni 2021 - 10118423 - IF10 - MichaaelAndreas

    public ViewPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case
                0:
                return new InfoFragment();
            case
                1:
                return new NoteFragment();
            case
                2:
                return new ProfileFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
