package com.lijiaxia.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 描述：
 * Forecast实体类
 * 作者：LJX
 * 时间：2017/2/1:下午3:26
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;
    
    public class Temperature{

        public String max;

        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
