package com.anningtex.viewbinding.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.anningtex.viewbinding.R;
import com.anningtex.viewbinding.databinding.ActivityTwoBinding;
import com.anningtex.viewbinding.fragment.OneFragment;
import com.anningtex.viewbinding.fragment.TwoFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * desc:  2. Fragment中使用ViewBinding
 */
public class TwoActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityTwoBinding twoBinding;
    private FragmentManager fm;
    private final List<Fragment> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        twoBinding = ActivityTwoBinding.inflate(getLayoutInflater());
        setContentView(twoBinding.getRoot());
        initView();
        initFragment();
    }

    private void initView() {
        twoBinding.textView1.setOnClickListener(this);
        twoBinding.textView2.setOnClickListener(this);

        OneFragment f1 = new OneFragment();
        TwoFragment f2 = new TwoFragment();
        list.add(f1);
        list.add(f2);
    }

    private void initFragment() {
        fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        FragmentPagerAdapter fpa = new FragmentPagerAdapter(fm) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        };

        twoBinding.pager.setAdapter(fpa);
        twoBinding.pager.setCurrentItem(0);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textView1:
                twoBinding.pager.setCurrentItem(0);
                break;
            case R.id.textView2:
                twoBinding.pager.setCurrentItem(1);
                break;
            default:
                break;
        }
    }
}