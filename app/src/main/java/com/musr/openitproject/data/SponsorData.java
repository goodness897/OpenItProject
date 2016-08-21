package com.musr.openitproject.data;

import android.graphics.drawable.Drawable;

/**
 * Created by goodn on 2016-08-22.
 */
public class SponsorData {

    private Drawable photo;
    private String title;
    private String content;
    private long price;

    public SponsorData(Drawable photo, String title, String content, long price) {
        this.photo = photo;
        this.title = title;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
