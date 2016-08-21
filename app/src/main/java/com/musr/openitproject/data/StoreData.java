package com.musr.openitproject.data;

import android.graphics.drawable.Drawable;

/**
 * Created by goodn on 2016-08-21.
 */
public class StoreData {
    private Drawable photo;
    private String title;
    private int discountRate;
    private long discountPrice;
    private long price;

    public StoreData() {

    }
    public StoreData(Drawable photo, String title, int discountRate, long discountPrice, long price) {
        this.photo = photo;
        this.title = title;
        this.discountRate = discountRate;
        this.discountPrice = discountPrice;
        this.price = price;
    }

    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public long getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(long discountPrice) {
        this.discountPrice = discountPrice;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
