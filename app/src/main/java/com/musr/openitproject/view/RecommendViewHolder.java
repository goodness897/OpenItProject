package com.musr.openitproject.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.musr.openitproject.R;
import com.musr.openitproject.data.RecommendSiteData;

/**
 * Created by goodn on 2016-08-14.
 */
public class RecommendViewHolder extends RecyclerView.ViewHolder {

    ImageView photoView;
    TextView titleView, distanceView, scoreView;

    public interface OnRecommendSiteItemClickListener {
        public void onRecommendSiteClick(View view, RecommendSiteData recommendSiteData, int position);
    }
    OnRecommendSiteItemClickListener listener;
    public void setOnRecommendSiteItemClickListener(OnRecommendSiteItemClickListener listener){
        this.listener = listener;
    }

    public RecommendViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listener != null) {
                    listener.onRecommendSiteClick(view, recommendSiteData, getAdapterPosition());
                }
            }
        });
        photoView = (ImageView)itemView.findViewById(R.id.image_photo);
        titleView = (TextView)itemView.findViewById(R.id.text_title);
        distanceView = (TextView)itemView.findViewById(R.id.text_distance);
        scoreView = (TextView)itemView.findViewById(R.id.text_score);

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
