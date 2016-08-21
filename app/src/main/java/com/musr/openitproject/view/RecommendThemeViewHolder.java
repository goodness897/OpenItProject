package com.musr.openitproject.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.musr.openitproject.R;
import com.musr.openitproject.data.RecommendThemeData;

/**
 * Created by goodn on 2016-08-20.
 */
public class RecommendThemeViewHolder extends RecyclerView.ViewHolder{

    ImageView themeView;
    public RecommendThemeViewHolder(View itemView) {
        super(itemView);

        themeView = (ImageView)itemView.findViewById(R.id.image_theme);

    }

    RecommendThemeData recommendThemeData;
    public void setRecommendThemeData(RecommendThemeData recommendThemeData) {
        this.recommendThemeData = recommendThemeData;
        themeView.setImageDrawable(recommendThemeData.getPhoto());

    }
}
