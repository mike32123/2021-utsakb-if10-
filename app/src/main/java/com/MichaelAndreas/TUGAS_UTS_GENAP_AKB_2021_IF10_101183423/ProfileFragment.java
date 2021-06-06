package com.MichaelAndreas.TUGAS_UTS_GENAP_AKB_2021_IF10_101183423;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProfileFragment extends Fragment {
    // 1 Juni 2021 - 10118423 - IF10 - MichaaelAndreas

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}