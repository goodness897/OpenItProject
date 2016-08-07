package com.musr.openitproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.musr.openitproject.data.AverageSpeedData;
import com.musr.openitproject.data.DistanceData;
import com.musr.openitproject.data.MaxSpeedData;
import com.musr.openitproject.view.AverageSpeedView;
import com.musr.openitproject.view.DistanceView;
import com.musr.openitproject.view.MaxSpeedView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SpeedMeterFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SpeedMeterFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    DistanceView distanceView;
    AverageSpeedView averageSpeedView;
    MaxSpeedView maxSpeedView;

    public SpeedMeterFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SpeedMeterFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SpeedMeterFragment newInstance(String param1, String param2) {
        SpeedMeterFragment fragment = new SpeedMeterFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_speed_meter, container, false);
        TextView text_distance = (TextView)view.findViewById(R.id.text_distance);
        String s = "0.00km";

        distanceView = (DistanceView) view.findViewById(R.id.view_distance);
        averageSpeedView = (AverageSpeedView) view.findViewById(R.id.view_averagespeed);
        maxSpeedView = (MaxSpeedView) view.findViewById(R.id.view_maxspeed);

        initData();
        return view;
    }

    private void initData() {
        DistanceData distanceData = new DistanceData();
        distanceData.setDistance(0.0);
        distanceView.setDistanceView(distanceData);

        AverageSpeedData averageSpeedData = new AverageSpeedData();
        averageSpeedData.setAverageSpeed(0.00);
        averageSpeedView.setAverageSpeedView(averageSpeedData);

        MaxSpeedData maxSpeedData = new MaxSpeedData();
        maxSpeedData.setMaxSpeed(0.00);
        maxSpeedView.setMaxSpeedView(maxSpeedData);

        getActivity().setTitle(getResources().getString(R.string.speedmeter));


    }

}
