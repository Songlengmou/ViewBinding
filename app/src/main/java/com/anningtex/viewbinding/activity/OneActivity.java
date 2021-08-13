package com.anningtex.viewbinding.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.anningtex.viewbinding.databinding.ActivityOneBinding;
import com.anningtex.viewbinding.databinding.LayoutOneBinding;

/**
 * @author Administrator
 * desc:AS3.6以上版本的
 * 1. ② Activity中ViewBinding的使用
 */
public class OneActivity extends AppCompatActivity {
    private ActivityOneBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = ActivityOneBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.tvOne.setOnClickListener(view -> Toast.makeText(OneActivity.this, "被点击了", Toast.LENGTH_SHORT).show());

        //当include里的根布局是 merge 的时候  采用这个方法来获取内容
        // ****  这时候 切记   include标签不可以有id 否则会报错  ****
        LayoutOneBinding layoutOneBinding = LayoutOneBinding.bind(mBinding.getRoot());
        layoutOneBinding.tvTwo.setText("include里的第二个控件赋值");
    }
}
