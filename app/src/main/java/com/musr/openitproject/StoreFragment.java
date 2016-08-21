package com.musr.openitproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.musr.openitproject.adapter.RecyclerStoreAdapter;
import com.musr.openitproject.data.StoreData;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StoreFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StoreFragment extends Fragment {

    public StoreFragment() {
        // Required empty public constructor
    }

    public static StoreFragment newInstance() {
        StoreFragment fragment = new StoreFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    RecyclerView listView;
    RecyclerStoreAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_store, container, false);

        listView = (RecyclerView)view.findViewById(R.id.rv_list);
        mAdapter = new RecyclerStoreAdapter();
        listView.setAdapter(mAdapter);

        LinearLayoutManager manager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        listView.setLayoutManager(manager);

        initData();
        return view;
    }

    int[] photo = {R.drawable.store_sample01, R.drawable.store_sample02, R.drawable.store_sample03, R.drawable.store_sample04, R.drawable.store_sample05 };

    StoreData storeData;
    private void initData() {
        Random r = new Random();

        for(int i = 0; i < 30; i++) {
            storeData = new StoreData();
            storeData.setPhoto(ContextCompat.getDrawable(getContext(), photo[i % photo.length]));
            storeData.setPrice(30000 + r.nextInt(100000));
            storeData.setDiscountRate(r.nextInt(20));
            double discountRate = 1 - (storeData.getDiscountRate() / 100.00);
            Log.i("Store", "discountRate : " + discountRate);
            long discountPrice = (long) (storeData.getPrice() * discountRate);
            Log.i("Store", "storeData.getPrice() : " + storeData.getPrice());
            Log.i("Store", "discountPrice : " + discountPrice);
            storeData.setDiscountPrice(discountPrice);
            storeData.setTitle("자전거 바이크 " + i);
            mAdapter.add(storeData);
        }

    }

}
