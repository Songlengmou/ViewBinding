package com.anningtex.viewbinding.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.anningtex.viewbinding.databinding.FragmentTwoBinding;

/**
 * @Author Song
 * @Desc:
 */
public class TwoFragment extends Fragment {
    private FragmentTwoBinding twoBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        twoBinding = FragmentTwoBinding.inflate(inflater);
        return twoBinding.getRoot();
    }
}
