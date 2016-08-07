package com.musr.openitproject.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.musr.openitproject.R;
import com.musr.openitproject.data.AverageSpeedData;

/**
 * Created by mu on 2016-08-07.
 */
public class AverageSpeedView extends FrameLayout {

    TextView averageSpeedView;
    AverageSpeedData mData;

    public void setAverageSpeedView(AverageSpeedData data) {
        mData = data;
        averageSpeedView.setText(data.getAverageSpeed()+ "km/h");

    }


    public AverageSpeedView(Context context) {
        this(context, null);
    }

    public AverageSpeedView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init();

    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.averagespeed_view, this);
        averageSpeedView = (TextView)findViewById(R.id.text_averagespeed);

    }
}
