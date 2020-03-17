package com.anningtex.viewbinding.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.anningtex.viewbinding.databinding.LayoutCommentBinding;

/**
 * @Author Song
 * @Desc: 3. 自定义View中使用ViewBinding
 */
public class MyView extends FrameLayout {
    LayoutCommentBinding commentBinding;

    public MyView(@NonNull Context context) {
        this(context, null);
    }

    public MyView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initLayout();
    }

    private void initLayout() {
        //之前的写法
        //View view = LayoutInflater.from(getContext()).inflate(R.layout.layout_comment, this, false);
        //addView(view);

        //使用ViewBinding的写法
        commentBinding = LayoutCommentBinding.inflate(LayoutInflater.from(getContext()), this, false);
        addView(commentBinding.getRoot());
    }

    public void setText(String str) {
        commentBinding.tvInclude.setText(str);
    }
}
