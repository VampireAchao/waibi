/**
  * Copyright 2020 bejson.com
  */
package com.ruben.waibi.product.vo;

import java.io.Serializable;

/**
 * Auto-generated: 2020-05-03 11:53:41
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Images implements Serializable {

    private String imgUrl;
    private int defaultImg;
    public void setImgUrl(String imgUrl) {
         this.imgUrl = imgUrl;
     }
     public String getImgUrl() {
         return imgUrl;
     }

    public void setDefaultImg(int defaultImg) {
         this.defaultImg = defaultImg;
     }
     public int getDefaultImg() {
         return defaultImg;
     }

}
