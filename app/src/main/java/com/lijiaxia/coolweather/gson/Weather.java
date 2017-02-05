package com.lijiaxia.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 描述：
 * 各个实体类对应的总的实体类
 * 作者：LJX
 * 时间：2017/2/1:下午3:31
 */

public class Weather {

    public String status;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
