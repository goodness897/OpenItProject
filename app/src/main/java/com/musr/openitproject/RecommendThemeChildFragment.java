package com.musr.openitproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.musr.openitproject.adapter.RecyclerRecommendThemeAdapter;
import com.musr.openitproject.data.RecommendThemeData;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecommendThemeChildFragment extends Fragment {

    RecyclerRecommendThemeAdapter mAdapter;
    RecommendThemeData recommendThemeData;
    RecyclerView listView;

    public RecommendThemeChildFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_recommend_theme_child, container, false);
        listView = (RecyclerView)view.findViewById(R.id.rv_list);
        mAdapter = new RecyclerRecommendThemeAdapter();

        listView.setAdapter(mAdapter);
        LinearLayoutManager manager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        listView.setLayoutManager(manager);
        initData();
        return view;
    }

    int[] photo = {R.drawable.recommend_theme_sample01, R.drawable.recommend_theme_sample02, R.drawable.recommend_theme_sample03, R.drawable.recommend_theme_sample04, R.drawable.recommend_theme_sample05};
    private void initData() {
        for(int i = 0; i < 20; i++) {
            recommendThemeData = new RecommendThemeData();
            recommendThemeData.setPhoto(ContextCompat.getDrawable(getContext(), photo[i % photo.length]));
            mAdapter.add(recommendThemeData);
        }
    }

}
