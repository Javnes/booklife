package com.jesper.model;

import lombok.Data;
import java.util.Date;

// 商品类
@Data
public class Item extends BaseObject{
    private int id;
    private String title; // 商品名
    private String sellPoint; // 商品介绍s
    private int price;  // 商品介绍
    private int num;    // 商品库存
    private String barcode; //
    private String image;
    private int cid;
    private int status;
    private Date created;
    private Date updated;
    private String createdStr;
    private String updatedStr;
    private String categoryName;
    private Integer minPrice;
    private Integer maxPrice;
    private Integer minNum;
    private Integer maxNum;

}
