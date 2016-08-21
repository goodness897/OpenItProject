package com.musr.openitproject.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.musr.openitproject.R;
import com.musr.openitproject.data.SponsorData;

/**
 * Created by goodn on 2016-08-22.
 */
public class SponsorViewHolder extends RecyclerView.ViewHolder {
    ImageView photoView;
    TextView titleView;
    TextView contentView;
    TextView priceView;


    public SponsorViewHolder(View itemView) {
        super(itemView);

        photoView = (ImageView)itemView.findViewById(R.id.image_photo);
        titleView = (TextView)itemView.findViewById(R.id.text_title);
        contentView = (TextView)itemView.findViewById(R.id.text_content);
        priceView = (TextView)itemView.findViewById(R.id.text_price);
    }

    public void setSponsorData(SponsorData sponsorData) {

        photoView.setImageDrawable(sponsorData.getPhoto());
        titleView.setText(sponsorData.getTitle());
        contentView.setText(sponsorData.getContent());
        if(sponsorData.getPrice() == 0) {
            priceView.setVisibility(View.GONE);
        } else {
            priceView.setText("$" + sponsorData.getPrice());

        }

    }
}
