package com.musr.openitproject.data;

/**
 * Created by goodn on 2016-08-20.
 */
public class RankingDistanceData {
    private String name;
    private float distance;
    private int rank;

    public RankingDistanceData(){

    }

    public RankingDistanceData( String name, float distance, int rank) {
        this.name = name;
        this.distance = distance;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
