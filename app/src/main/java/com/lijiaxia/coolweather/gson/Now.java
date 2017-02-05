package com.lijiaxia.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 描述：
 * Now实体类
 * 作者：LJX
 * 时间：2017/2/1:下午3:17
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
