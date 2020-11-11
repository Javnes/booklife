package com.jesper.model;

import lombok.Data;

// 快递公司信息
@Data
public class Delivery {

    private Integer id;

    private String deliveryName; // 快递公司名

    private String deliveryCode; // 快递公司代号

    private String deliverySort; // 合作快递公司分类

    private String expressNo;

}