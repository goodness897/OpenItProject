package com.musr.openitproject.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.musr.openitproject.R;
import com.musr.openitproject.data.WeatherData;

/**
 * Created by mu on 2016-07-24.
 */
public class WeatherView extends FrameLayout {

    ImageView weatherIconView;
    TextView weatherTextView;

    WeatherData mData;

    public void setWeatherData(WeatherData data) {
        mData = data;
        weatherIconView.setImageResource(data.getImageId());
        weatherTextView.setText(""+data.getTemperature() +"º");

    }

    public WeatherView(Context context) {
        this(context, null);
        init();
    }

    public WeatherView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.weather_view, this);
        weatherIconView = (ImageView)findViewById(R.id.image_icon);
        weatherTextView = (TextView)findViewById(R.id.text_weather);

    }
}
