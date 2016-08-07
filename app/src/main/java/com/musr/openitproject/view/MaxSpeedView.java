package com.musr.openitproject.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.musr.openitproject.R;
import com.musr.openitproject.data.MaxSpeedData;

/**
 * Created by mu on 2016-08-07.
 */
public class MaxSpeedView extends FrameLayout {

    TextView maxSpeedView;
    MaxSpeedData data;

    public void setMaxSpeedView(MaxSpeedData data) {
        this.data = data;
        maxSpeedView.setText(data.getMaxSpeed()+ "km/h");

    }


    public MaxSpeedView(Context context) {
        this(context, null);
    }

    public MaxSpeedView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init();

    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.maxspeed_view, this);
        maxSpeedView = (TextView)findViewById(R.id.text_maxspeed);

    }
}
