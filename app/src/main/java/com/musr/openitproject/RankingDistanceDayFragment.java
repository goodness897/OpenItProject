package com.musr.openitproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.musr.openitproject.adapter.RecyclerRankingDistanceAdapter;
import com.musr.openitproject.data.RankingDistanceData;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class RankingDistanceDayFragment extends Fragment {

    RecyclerView listView;
    RecyclerRankingDistanceAdapter mAdapter;

    public RankingDistanceDayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ranking_distance_day, container, false);
        listView = (RecyclerView) view.findViewById(R.id.rv_list);
        mAdapter = new RecyclerRankingDistanceAdapter();
        listView.setAdapter(mAdapter);

        LinearLayoutManager manager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        listView.setLayoutManager(manager);

        initData();
        return view;
    }


    private void initData() {

        Random r = new Random();
        for (int i = 1; i < 30; i++) {
            RankingDistanceData rankingDistanceData = new RankingDistanceData();
            rankingDistanceData.setRank(i);
            rankingDistanceData.setDistance(r.nextInt(300) + r.nextFloat());
            rankingDistanceData.setName("Name " + i);
            mAdapter.add(rankingDistanceData);
        }
    }

}
