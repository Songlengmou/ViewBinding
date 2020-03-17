package com.anningtex.viewbinding.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.anningtex.viewbinding.databinding.FragmentOneBinding;

/**
 * @Author Song
 * @Desc:
 */
public class OneFragment extends Fragment {

    private FragmentOneBinding oneBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        oneBinding = FragmentOneBinding.inflate(inflater);
        return oneBinding.getRoot();
    }
}
