package com.musr.openitproject.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.musr.openitproject.R;
import com.musr.openitproject.data.WindData;

public class WindView extends FrameLayout {
    ImageView imageWindView;
    TextView textWindView;

    WindData mData;

    public void setWindData(WindData data) {
        mData = data;
        imageWindView.setImageResource(data.getImageId());
        textWindView.setText(""+data.getWindSpeed() + "m/s");

    }

    public WindView(Context context) {
        this(context, null);
        init();
    }

    public WindView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.wind_view, this);
        imageWindView = (ImageView)findViewById(R.id.image_wind_icon);
        textWindView = (TextView)findViewById(R.id.text_wind);



    }
}
