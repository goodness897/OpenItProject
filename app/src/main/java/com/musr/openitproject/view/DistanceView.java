package com.musr.openitproject.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.musr.openitproject.R;
import com.musr.openitproject.data.DistanceData;

/**
 * Created by mu on 2016-08-07.
 */
public class DistanceView extends FrameLayout {

    TextView distanceView;
    DistanceData data;

    public void setDistanceView(DistanceData data) {
        this.data = data;
        distanceView.setText(data.getDistance()+ "km");

    }


    public DistanceView(Context context) {
        this(context, null);
    }

    public DistanceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init();

    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.distance_view, this);
        distanceView = (TextView)findViewById(R.id.text_distance);

    }
}
