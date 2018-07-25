package com.springbootmybatis.model;

import java.sql.Timestamp;

public class AccessoryEntity {

    private long id;
    private Timestamp addTime;
    private Boolean deleteStatus;
    private String ext;
    private Integer height;
    private String info;
    private String name;
    private String path;
    private Float size;
    private Integer width;
    private long album_id;
    private long user_id;
    private long config_id;

    public AccessoryEntity() {
    }

    public AccessoryEntity(long id, Timestamp addTime, Boolean deleteStatus, String ext, Integer height, String info, String name, String path, Float size, Integer width, long album_id, long user_id, long config_id) {
        this.id = id;
        this.addTime = addTime;
        this.deleteStatus = deleteStatus;
        this.ext = ext;
        this.height = height;
        this.info = info;
        this.name = name;
        this.path = path;
        this.size = size;
        this.width = width;
        this.album_id = album_id;
        this.user_id = user_id;
        this.config_id = config_id;
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

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public long getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(long album_id) {
        this.album_id = album_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getConfig_id() {
        return config_id;
    }

    public void setConfig_id(long config_id) {
        this.config_id = config_id;
    }
}
