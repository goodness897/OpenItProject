package com.musr.openitproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.musr.openitproject.R;
import com.musr.openitproject.data.StoreData;
import com.musr.openitproject.view.StoreViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by goodn on 2016-08-21.
 */
public class RecyclerStoreAdapter extends RecyclerView.Adapter<StoreViewHolder> {

    List<StoreData> items = new ArrayList<>();

    public void add(StoreData storeData) {
        items.add(storeData);
        notifyDataSetChanged();
    }
    @Override
    public StoreViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_store, parent, false);
        StoreViewHolder holder = new StoreViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(StoreViewHolder holder, int position) {
        holder.setStoreData(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
