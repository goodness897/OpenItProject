package com.musr.openitproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SearchRidingFragment extends Fragment {


    public SearchRidingFragment() {
        // Required empty public constructor
    }

    public static SearchRidingFragment newInstance() {
        SearchRidingFragment fragment = new SearchRidingFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    FragmentTabHost tabHost;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_search_riding, container, false);
        tabHost = (FragmentTabHost)view.findViewById(R.id.tabhost);
        tabHost.setup(getContext(), getChildFragmentManager(), android.R.id.tabcontent);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator(getResources().getString(R.string.search_tab_child_one)), SearchRidingChildOneFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator(getResources().getString(R.string.search_tab_child_two)), SearchRidingChildOneFragment.class, null);

        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
            View v = tabHost.getTabWidget().getChildAt(i);

            TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(getResources().getColor(R.color.white));
        }

        return view;
    }

}
