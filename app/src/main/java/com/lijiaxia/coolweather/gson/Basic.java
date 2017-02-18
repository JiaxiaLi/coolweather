package com.lijiaxia.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 描述：
 * Basic实体类
 * 作者：LJX
 * 时间：2017/2/1:下午3:09
 */

public class Basic {
    /**
     * @SerializedName注解的方式来让JSON字段和Java字段之间建立映射关系
     */
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }


}
