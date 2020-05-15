package com.cd826dong.clouddemo.baihui.dto;

import com.cd826dong.clouddemo.baihui.entity.ErShouHouse;
import com.google.common.base.MoreObjects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "二手房信息包")
public class ErShouHouseDTO implements Serializable {
    private static final long serialVersionUID = 6970946257889016657L;
    @ApiModelProperty(value = "商品主键Id")
    private Long id;
    /** 房子的简介 */
    @ApiModelProperty(value="二手房名称")
    private String title;
    /** 房子总价 */
    @ApiModelProperty(value="二手房总价")
    private String totalPrice;
    /** 房子面积 */
    @ApiModelProperty(value="二手房面积")
    private String area;
    /**小区名称**/
    @ApiModelProperty(value="小区名称")
    private String resblockName;
    /**隶属的区县的名称**/
    @ApiModelProperty(value="属的区县的名称")
    private String districtName;
    /**户型**/
    @ApiModelProperty(value="户型名称")
    private String hallNum;
    /**图片**/
    @ApiModelProperty(value="图片列表")
    private String pictures;
    /**楼**/
    @ApiModelProperty(value="楼层")
    private String floor;

    /** 以上为数据库中包含的信息**/
    @ApiModelProperty(value="单价")
    private String price; //单价
    @ApiModelProperty(value="单位")
    private String unitPrice; //单位
    @ApiModelProperty(value="面积单位")
    private String unitArea;//面积单位
    @ApiModelProperty(value="城市")
    private String district;//城市

    @ApiModelProperty(value="装修情况")
    private String renovation;//装修情况
    @ApiModelProperty(value="有无电梯")
    private String elevator;//有无电梯
    @ApiModelProperty(value="售卖原因")
    private String reason;// 售卖原因

    public ErShouHouseDTO(){

    }
    public ErShouHouseDTO(ErShouHouse erShouHouse){
        this.id = erShouHouse.getId();
        this.title = erShouHouse.getTitle();
        this.totalPrice = erShouHouse.getTotalPrice();
        this.area = erShouHouse.getArea();
        this.resblockName = erShouHouse.getResblockName();
        this.districtName = erShouHouse.getDistrictName();
        this.hallNum = erShouHouse.getHallNum();
        this.pictures = erShouHouse.getPictures();
        this.floor = erShouHouse.getFloor();

//        this.price = String.valueOf(Float.parseFloat(erShouHouse.getTotalPrice())/Integer.getInteger(erShouHouse.getArea()));
        this.price = "12";
        this.unitPrice = "万元";
        this.unitArea = "平方米";
        this.district = "成都";
        this.renovation = "未知";
        this.elevator = "未知";
        this.reason = "未知";
    }
    @Override
    public String toString() {
        return this.toStringHelper().toString();
    }

    protected MoreObjects.ToStringHelper toStringHelper() {
        return MoreObjects.toStringHelper(this)
                .add("id", getTitle())
                .add("productId", getPrice());
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getUnitArea() {
        return unitArea;
    }

    public void setUnitArea(String unitArea) {
        this.unitArea = unitArea;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRenovation() {
        return renovation;
    }

    public void setRenovation(String renovation) {
        this.renovation = renovation;
    }

    public String getElevator() {
        return elevator;
    }

    public void setElevator(String elevator) {
        this.elevator = elevator;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
