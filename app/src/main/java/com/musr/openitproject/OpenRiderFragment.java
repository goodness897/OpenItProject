package com.musr.openitproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.musr.openitproject.data.UvData;
import com.musr.openitproject.data.WeatherData;
import com.musr.openitproject.data.WindData;
import com.musr.openitproject.view.UvView;
import com.musr.openitproject.view.WeatherView;
import com.musr.openitproject.view.WindView;


/**
 * A simple {@link Fragment} subclass.
 */
public class OpenRiderFragment extends Fragment {

    WeatherView weatherView;
    WindView windView;
    UvView uvView;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public OpenRiderFragment() {
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_open_rider, container, false);
        TextView text_distance = (TextView)view.findViewById(R.id.text_distance);
        String s = "0.00km";
        text_distance.setText(setSpanSizeText(s, 1.5f, 0, 4, 0));

        weatherView = (WeatherView) view.findViewById(R.id.weatherView);
        windView = (WindView) view.findViewById(R.id.windView);
        uvView = (UvView)view.findViewById(R.id.uvView);

        initData();
        return view;
    }

    private void initData() {
        WeatherData data = new WeatherData();
        data.setImageId(R.drawable.ic_openrider_weather);
        data.setTemperature(32);
        weatherView.setWeatherData(data);

        WindData wind_Data = new WindData();
        wind_Data.setImageId(R.drawable.ic_openrider_wind);
        wind_Data.setWindSpeed(32);
        windView.setWindData(wind_Data);

        UvData uv_data = new UvData();
        uv_data.setUv(10);
        uv_data.setStandby(10);
        uvView.setUvView(uv_data);

        getActivity().setTitle(getResources().getString(R.string.en_openrider));
    }

    private SpannableString setSpanSizeText(String s, float size, int start, int end, int flag) {
        SpannableString ss1 = new SpannableString(s);
        ss1.setSpan(new RelativeSizeSpan(size), start, end, flag);
        return ss1;
    }

}
