package com.musr.openitproject.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.musr.openitproject.R;
import com.musr.openitproject.data.UvData;

/**
 * Created by mu on 2016-07-24.
 */
public class UvView extends FrameLayout{

    TextView uvText;
    TextView standbyText;
    UvData mData;
    public void setUvView(UvData data) {
        mData = data;
        uvText.setText("" + data.getUv());
        standbyText.setText("" + data.getStandby());
    }

    public UvView(Context context) {
        this(context, null);
        init();
    }

    public UvView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.uv_view, this);
        uvText = (TextView)findViewById(R.id.text_uv);
        standbyText = (TextView)findViewById(R.id.text_standby);
        uvText.setTextColor(Color.YELLOW);
        standbyText.setTextColor(Color.GREEN);


    }
}
