package com.tech.myapp.myapplication.mainPage;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tech.myapp.myapplication.R;
import com.tech.myapp.myapplication.callbacks.NewsItemClickCallback;
import com.tech.myapp.myapplication.entities.NewsItemEntity;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Shemin on 7/11/2018.
 */

public class MainPageAdapter extends RecyclerView.Adapter<MainPageAdapter.NewsViewHolder>{
    ArrayList<NewsItemEntity> items;
    Context context;

    public MainPageAdapter(Context context, ArrayList<NewsItemEntity> items1) {
        this.context = context;
        this.items = items1;

    }


    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflateView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_news_layout,null);
        NewsViewHolder dataObjectHolder = new NewsViewHolder(inflateView);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        final NewsItemEntity entity = items.get(position);
        holder.tvName.setText(entity.getTitle());
        holder.tvDate.setText(entity.getPublished_date());
        holder.rlItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewsItemClickCallback callback = (NewsItemClickCallback) context;
                callback.onItemClick(entity);
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvDate;
        RelativeLayout rlItem;
        public NewsViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvDate = itemView.findViewById(R.id.tvDate);
            rlItem = itemView.findViewById(R.id.rlItem);
        }
    }
}
