package com.anningtex.viewbinding.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.anningtex.viewbinding.databinding.ActivityMainBinding;

/**
 * @author Administrator
 * desc: AS3.6以上版本的 四个绑定使用  分别在 MainActivity、OneActivity、TwoActivity、MyView、MainAdapter
 * 1. ① Activity中ViewBinding的使用
 */
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.tvText.setText("跳转OneActivity");
        mBinding.tvText.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, OneActivity.class)));

        mBinding.tvText2.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, TwoActivity.class)));

        //获取带有include的布局文件中的内容id
        mBinding.layoutInclude.tvInclude.setText("include里的控件赋值");
    }
}