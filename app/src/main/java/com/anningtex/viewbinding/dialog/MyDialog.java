package com.anningtex.viewbinding.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;

import com.anningtex.viewbinding.R;
import com.anningtex.viewbinding.databinding.DialogMyBinding;

/**
 * @Author Song
 */
public class MyDialog extends Dialog implements View.OnClickListener {
    private DialogMyBinding binding;
    private Context context;

    public MyDialog(@NonNull Context context) {
        super(context);
        this.context = context;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        binding = DialogMyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setCanceledOnTouchOutside(false);
        showDialog();
    }

    private void showDialog() {
        Window window = getWindow();
        window.setWindowAnimations(R.style.style_dialog);
        WindowManager.LayoutParams wl = window.getAttributes();
        wl.gravity = Gravity.CENTER;
        window.setAttributes(wl);
        initView();
    }

    private void initView() {
        binding.tvShare.setOnClickListener(this);
        binding.tvCancel.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_share:
            case R.id.tv_cancel:
                dismiss();
                break;
            default:
                break;
        }
    }
}
