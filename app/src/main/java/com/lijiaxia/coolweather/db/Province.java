package com.lijiaxia.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 描述：
 * 建立Province表格存放省的数据
 * 作者：LJX
 * 时间：2017/1/25:下午3:23
 */

public class Province extends DataSupport{

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
