package com.musr.openitproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.musr.openitproject.adapter.RecyclerSponsorAdapter;
import com.musr.openitproject.data.SponsorData;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SponsorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SponsorFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public SponsorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SponsorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SponsorFragment newInstance(String param1, String param2) {
        SponsorFragment fragment = new SponsorFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    RecyclerView listView;
    RecyclerSponsorAdapter mAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sponsor, container, false);

        listView = (RecyclerView)view.findViewById(R.id.rv_list);
        listView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL_LIST));
        mAdapter = new RecyclerSponsorAdapter();
        listView.setAdapter(mAdapter);

        LinearLayoutManager manager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        listView.setLayoutManager(manager);


        initData();

        return view;
    }
    int photo[] = {R.drawable.ic_sponsor_sample01, R.drawable.ic_sponsor_sample02, R.drawable.ic_sponsor_sample03,R.drawable.ic_sponsor_sample04};

    private void initData() {
        mAdapter.add(new SponsorData(ContextCompat.getDrawable(getContext(), photo[0]),
                getResources().getString(R.string.sponsor_americano), getResources().getString(R.string.sponsor_americano_content), 2900));
        mAdapter.add(new SponsorData(ContextCompat.getDrawable(getContext(), photo[1]),
                getResources().getString(R.string.sponsor_hambuger), getResources().getString(R.string.sponsor_hambuger_content), 2900));
        mAdapter.add(new SponsorData(ContextCompat.getDrawable(getContext(), photo[2]),
                getResources().getString(R.string.sponsor_chicken), getResources().getString(R.string.sponsor_chicken_content), 2900));
        mAdapter.add(new SponsorData(ContextCompat.getDrawable(getContext(), photo[3]),
                getResources().getString(R.string.sponsor_ad), getResources().getString(R.string.sponsor_ad_content), 0));
    }

}
