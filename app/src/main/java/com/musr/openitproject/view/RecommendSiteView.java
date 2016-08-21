package com.musr.openitproject.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.musr.openitproject.R;
import com.musr.openitproject.data.RecommendSiteData;

/**
 * Created by goodn on 2016-08-14.
 */
public class RecommendSiteView extends FrameLayout {
    public RecommendSiteView(Context context) {
        this(context, null);
    }

    public RecommendSiteView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    ImageView photoView;
    TextView titleView, distanceView, scoreView;

    private void init() {

        inflate(getContext(), R.layout.view_recommendsite, this);
        photoView = (ImageView)findViewById(R.id.image_photo);
        titleView = (TextView)findViewById(R.id.text_title);
        distanceView = (TextView)findViewById(R.id.text_distance);
        scoreView = (TextView)findViewById(R.id.text_score);

    }

    RecommendSiteData recommendSiteData;
    public void setRecommendSiteData(RecommendSiteData recommendSiteData) {
        this.recommendSiteData = recommendSiteData;
        titleView.setText(recommendSiteData.getTitle());
        distanceView.setText(recommendSiteData.getDistance() + "km");
        scoreView.setText(recommendSiteData.getScore() + "점");
        photoView.setImageDrawable(recommendSiteData.getPhoto());

    }

}
