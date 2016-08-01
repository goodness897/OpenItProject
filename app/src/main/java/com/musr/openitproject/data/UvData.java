package com.musr.openitproject.data;

/**
 * Created by mu on 2016-07-24.
 */
public class UvData {

    private int uv; // 자외선
    private int standby; //대기 상태

    public int getStandby() {
        return standby;
    }

    public void setStandby(int standby) {
        this.standby = standby;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }
}
