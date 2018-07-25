package com.springbootmybatis.model;

import java.sql.Timestamp;

public class AlbumEntity {
    private long id;
    private Timestamp addTime;
    private Boolean deleteStatus;
    private String alblum_info;
    private Boolean album_default;
    private String album_name;
    private Integer album_sequence;
    private long album_cover_id;
    private long user_id;

    public AlbumEntity(){
        super();
    }

    public AlbumEntity(long id, Timestamp addTime, Boolean deleteStatus, String alblum_info, Boolean album_default, String album_name, Integer album_sequence, long album_cover_id, long user_id) {
        this.id = id;
        this.addTime = addTime;
        this.deleteStatus = deleteStatus;
        this.alblum_info = alblum_info;
        this.album_default = album_default;
        this.album_name = album_name;
        this.album_sequence = album_sequence;
        this.album_cover_id = album_cover_id;
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

    public String getAlblum_info() {
        return alblum_info;
    }

    public void setAlblum_info(String alblum_info) {
        this.alblum_info = alblum_info;
    }

    public Boolean getAlbum_default() {
        return album_default;
    }

    public void setAlbum_default(Boolean album_default) {
        this.album_default = album_default;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public Integer getAlbum_sequence() {
        return album_sequence;
    }

    public void setAlbum_sequence(Integer album_sequence) {
        this.album_sequence = album_sequence;
    }

    public long getAlbum_cover_id() {
        return album_cover_id;
    }

    public void setAlbum_cover_id(long album_cover_id) {
        this.album_cover_id = album_cover_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
}
