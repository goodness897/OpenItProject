package com.musr.openitproject.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.musr.openitproject.R;
import com.musr.openitproject.data.RankingDistanceData;

/**
 * Created by goodn on 2016-08-20.
 */
public class RankingDistanceViewHolder extends RecyclerView.ViewHolder {

    TextView rankView;
    TextView nameView;
    TextView distanceView;
    public RankingDistanceViewHolder(View itemView) {
        super(itemView);
        nameView = (TextView)itemView.findViewById(R.id.text_name);
        distanceView = (TextView)itemView.findViewById(R.id.text_distance);
        rankView = (TextView)itemView.findViewById(R.id.text_rank);
    }

    RankingDistanceData rankingDistanceData;
    public void setRankingDistanceData(RankingDistanceData rankingDistanceData) {
        this.rankingDistanceData = rankingDistanceData;
        nameView.setText(rankingDistanceData.getName());
        float distance = rankingDistanceData.getDistance();
        String strDistance = String.format("%.2f", distance);
        distanceView.setText(strDistance + "km");
        rankView.setText(rankingDistanceData.getRank() + "");

    }
}
