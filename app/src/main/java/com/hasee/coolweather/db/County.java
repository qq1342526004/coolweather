package com.hasee.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;//县id
    private String countryName;//县名
    private String weatherId;//该县的天气Id
    private int cityId;//所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
