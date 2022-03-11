package com.example.simpleparadox.listycity;

public class City {
    public String city;
    public String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }
}
