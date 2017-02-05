package com.lijiaxia.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 描述：
 * Suggestion实体类
 * 作者：LJX
 * 时间：2017/2/1:下午3:21
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
