package com.lijiaxia.coolweather.gson;

/**
 * 描述：
 * AQI实体类
 * 作者：LJX
 * 时间：2017/2/1:下午3:15
 */

public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}
