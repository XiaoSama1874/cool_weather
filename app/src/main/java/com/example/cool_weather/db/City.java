package com.example.cool_weather.db;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {
    private int id;
    private String city_name;
    private int city_id;
    private int province_id;

    public int getProvince_id() {

        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }
}
