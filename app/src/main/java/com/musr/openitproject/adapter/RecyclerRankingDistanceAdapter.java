package com.musr.openitproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.musr.openitproject.R;
import com.musr.openitproject.data.RankingDistanceData;
import com.musr.openitproject.view.RankingDistanceViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by goodn on 2016-08-21.
 */
public class RecyclerRankingDistanceAdapter extends RecyclerView.Adapter<RankingDistanceViewHolder> {

    List<RankingDistanceData> items = new ArrayList<>();

    public void add(RankingDistanceData rankingDistanceData) {
        items.add(rankingDistanceData);
        notifyDataSetChanged();
    }

    @Override
    public RankingDistanceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_ranking_distance, parent, false);
        RankingDistanceViewHolder holder = new RankingDistanceViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(RankingDistanceViewHolder holder, int position) {
        holder.setRankingDistanceData(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
