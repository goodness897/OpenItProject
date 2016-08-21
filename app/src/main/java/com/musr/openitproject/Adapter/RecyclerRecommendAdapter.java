package com.musr.openitproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.musr.openitproject.R;
import com.musr.openitproject.data.RecommendSiteData;
import com.musr.openitproject.view.RecommendViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by goodn on 2016-08-14.
 */
public class RecyclerRecommendAdapter extends RecyclerView.Adapter<RecommendViewHolder> implements RecommendViewHolder.OnRecommendSiteItemClickListener {

    List<RecommendSiteData> items = new ArrayList<>();

    public void add(RecommendSiteData recommendSiteData) {
        items.add(recommendSiteData);
        notifyDataSetChanged();
    }

    @Override
    public RecommendViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_recommendsite, parent, false);
        RecommendViewHolder holder = new RecommendViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecommendViewHolder holder, int position) {
        holder.setRecommendSiteData(items.get(position));

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onRecommendSiteClick(View view, RecommendSiteData recommendSiteData, int position) {
        if (listener != null) {
            listener.onAdapterItemClick(view, recommendSiteData, position);
        }
    }

    public interface OnAdapterItemClickListener {
        public void onAdapterItemClick(View view, RecommendSiteData recommendSiteData, int position);

    }

    OnAdapterItemClickListener listener;

    public void setOnAdapterItemClickListener(OnAdapterItemClickListener listener) {
        this.listener = listener;

    }
}
