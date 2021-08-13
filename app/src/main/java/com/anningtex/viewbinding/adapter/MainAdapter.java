package com.anningtex.viewbinding.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anningtex.viewbinding.databinding.LayoutCommentBinding;

import java.util.List;

/**
 * @Author Song
 * @Desc: 4. Adapter中使用ViewBinding
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private final List<String> mList;

    public MainAdapter(List<String> list) {
        mList = list;
    }

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //之前的写法
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_comment, parent, false);
        //ViewHolder holder = new ViewHolder(view);

        //使用ViewBinding的写法
        LayoutCommentBinding commentBinding = LayoutCommentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ViewHolder holder = new ViewHolder(commentBinding);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {
        holder.mTextView.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        //之前的写法
        //public ViewHolder(@NonNull View itemView) {
        //    super(itemView);
        //    mTextView = itemView.findViewById(R.id.tv_include);
        //}

        //使用ViewBinding的写法
        ViewHolder(@NonNull LayoutCommentBinding commentBinding) {
            super(commentBinding.getRoot());
            mTextView = commentBinding.tvInclude;
        }
    }
}