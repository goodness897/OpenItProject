package com.musr.openitproject.data;

import android.graphics.drawable.Drawable;

/**
 * Created by goodn on 2016-08-20.
 */
public class RecommendThemeData {

    private Drawable photo;

    public RecommendThemeData() {

    }

    public RecommendThemeData(Drawable photo) {
        this.photo = photo;
    }

    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }
}
