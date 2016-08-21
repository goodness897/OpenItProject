package com.musr.openitproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.musr.openitproject.adapter.RecyclerRecommendAdapter;
import com.musr.openitproject.data.RecommendSiteData;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecommendPopulariryChildWeekFragment extends Fragment {


    RecyclerView listView;
    RecyclerRecommendAdapter mAdapter;

    public RecommendPopulariryChildWeekFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recommend_populariry_child_week, container, false);
        listView = (RecyclerView)view.findViewById(R.id.rv_list);
        mAdapter = new RecyclerRecommendAdapter();

        listView.setAdapter(mAdapter);
        LinearLayoutManager manager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        listView.setLayoutManager(manager);

        initData();
        return view;
    }

    int[] photo = {R.drawable.recommend_sample01, R.drawable.recommend_sample02, R.drawable.recommend_sample03, R.drawable.recommend_sample04, R.drawable.recommend_sample05};
    private void initData() {
        Random r = new Random();
        for(int i = 0; i < 30; i++) {
            RecommendSiteData recommendSiteData = new RecommendSiteData();
            recommendSiteData.setPhoto(ContextCompat.getDrawable(getContext(), photo[i % photo.length]));
            recommendSiteData.setDistance(10 + r.nextInt(20));
            recommendSiteData.setTitle("자전거길 " + i);
            recommendSiteData.setScore(100 + r.nextInt(50));
            mAdapter.add(recommendSiteData);
        }
    }

}
