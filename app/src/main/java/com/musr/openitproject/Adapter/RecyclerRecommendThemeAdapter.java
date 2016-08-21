package com.musr.openitproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.musr.openitproject.R;
import com.musr.openitproject.data.RecommendThemeData;
import com.musr.openitproject.view.RecommendThemeViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by goodn on 2016-08-20.
 */
public class RecyclerRecommendThemeAdapter extends RecyclerView.Adapter<RecommendThemeViewHolder> {

    List<RecommendThemeData> items = new ArrayList<>();

    public void add(RecommendThemeData recommendThemeData) {
        items.add(recommendThemeData);
        notifyDataSetChanged();
    }

    @Override
    public RecommendThemeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_recommend_theme, parent, false);
        RecommendThemeViewHolder holder = new RecommendThemeViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecommendThemeViewHolder holder, int position) {
        holder.setRecommendThemeData(items.get(position));

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
