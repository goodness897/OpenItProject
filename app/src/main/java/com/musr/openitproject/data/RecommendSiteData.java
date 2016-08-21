package com.musr.openitproject.data;

import android.graphics.drawable.Drawable;

/**
 * Created by goodn on 2016-08-14.
 */
public class RecommendSiteData {
    private String title;
    private Drawable photo;
    private int score;
    private int distance;

    public RecommendSiteData() {

    }
    public RecommendSiteData(String title, int score, int distance, Drawable photo) {
        this.title = title;
        this.score = score;
        this.distance = distance;
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
