package com.musr.openitproject.view;

import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.musr.openitproject.R;
import com.musr.openitproject.data.StoreData;

/**
 * Created by goodn on 2016-08-21.
 */
public class StoreViewHolder extends RecyclerView.ViewHolder {

    ImageView photoView;
    TextView titleView;
    TextView priceView;
    TextView discountView;
    TextView discountPriceView;

    public StoreViewHolder(View itemView) {
        super(itemView);

        photoView = (ImageView) itemView.findViewById(R.id.image_store_photo);
        titleView = (TextView) itemView.findViewById(R.id.text_title);
        priceView = (TextView) itemView.findViewById(R.id.text_price);
        discountView = (TextView) itemView.findViewById(R.id.text_discount);
        discountPriceView = (TextView) itemView.findViewById(R.id.text_discount_price);

    }

    StoreData storeData;
    public void setStoreData(StoreData storeData) {
        this.storeData = storeData;
        photoView.setImageDrawable(storeData.getPhoto());
        titleView.setText(storeData.getTitle());
        priceView.setText(storeData.getPrice() + "원");
        priceView.setPaintFlags(priceView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        discountView.setText(storeData.getDiscountRate() + "%↓");
        discountPriceView.setText(storeData.getDiscountPrice() +"원");


    }
}
