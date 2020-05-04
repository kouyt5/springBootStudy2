package com.cd826dong.clouddemo.baihui.entity;

import com.google.common.base.MoreObjects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 二手房信息
 * @author 陈航
 */
@Entity
@Table(name = "erShou")
public class ErShouHouse implements Serializable {

    private static final long serialVersionUID = 1L;

    // ========================================================================
    // fields =================================================================
    @Id
    @GeneratedValue
    /** 商品数据库主键 */
    private Long id;
    /** 房子的简介 */
    private String title;
    /** 房子总价 */
    private String totalPrice;
    /** 房子面积 */
    private String area;
    /**小区名称**/
    private String resblockName;
    /**隶属的区县的名称**/
    private String districtName;
    /**户型**/
    private String hallNum;
    /**图片**/
    private String pictures;
    /**楼**/
    private String floor;
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("简介", getTitle())
                .add("price", getTotalPrice()).toString();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getResblockName() {
        return resblockName;
    }

    public void setResblockName(String resblockName) {
        this.resblockName = resblockName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getHallNum() {
        return hallNum;
    }

    public void setHallNum(String hallNum) {
        this.hallNum = hallNum;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}
