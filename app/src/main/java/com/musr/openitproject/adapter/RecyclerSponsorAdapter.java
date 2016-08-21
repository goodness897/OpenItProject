package com.musr.openitproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.musr.openitproject.R;
import com.musr.openitproject.data.SponsorData;
import com.musr.openitproject.view.SponsorViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by goodn on 2016-08-22.
 */
public class RecyclerSponsorAdapter extends RecyclerView.Adapter<SponsorViewHolder> {

    List<SponsorData> items = new ArrayList<>();
    public void add(SponsorData sponsorData) {
        items.add(sponsorData);
        notifyDataSetChanged();
    }
    @Override
    public SponsorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sponsor, parent, false);
        SponsorViewHolder holder = new SponsorViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(SponsorViewHolder holder, int position) {
        holder.setSponsorData(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
