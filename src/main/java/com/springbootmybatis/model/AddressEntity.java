package com.springbootmybatis.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class AddressEntity implements Serializable {

    private long id;
    private Timestamp addTime;
    private Boolean deleteStatus;
    private String area_info;
    private String mobile;
    private String telephone;
    private String trueName;
    private String zip;
    private long area_id;
    private long user_id;

    public AddressEntity() {
        super();
    }

    public AddressEntity(long id, Timestamp addTime, Boolean deleteStatus, String area_info, String mobile, String telephone, String trueName, String zip, long area_id, long user_id) {
        super();
        this.id = id;
        this.addTime = addTime;
        this.deleteStatus = deleteStatus;
        this.area_info = area_info;
        this.mobile = mobile;
        this.telephone = telephone;
        this.trueName = trueName;
        this.zip = zip;
        this.area_id = area_id;
        this.user_id = user_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public String getArea_info() {
        return area_info;
    }

    public void setArea_info(String area_info) {
        this.area_info = area_info;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public long getArea_id() {
        return area_id;
    }

    public void setArea_id(long area_id) {
        this.area_id = area_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "id: " + this.id + ", addTime: " + this.addTime + "area_info " + this.area_info;
    }
}
