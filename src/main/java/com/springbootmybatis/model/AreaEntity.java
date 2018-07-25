package com.springbootmybatis.model;

import java.sql.Timestamp;

public class AreaEntity {
    private long id;
    private Timestamp addTime;
    private Boolean deleteStatus;
    private String areaName;
    private Integer level;
    private Integer sequence;
    private long parent_id;
    private Boolean common;

    public AreaEntity() {
        super();
    }

    public AreaEntity(long id, Timestamp addTime, Boolean deleteStatus, String areaName, Integer level, Integer sequence, long parent_id, Boolean common) {
        super();
        this.id = id;
        this.addTime = addTime;
        this.deleteStatus = deleteStatus;
        this.areaName = areaName;
        this.level = level;
        this.sequence = sequence;
        this.parent_id = parent_id;
        this.common = common;
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

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public long getParent_id() {
        return parent_id;
    }

    public void setParent_id(long parent_id) {
        this.parent_id = parent_id;
    }

    public Boolean getCommon() {
        return common;
    }

    public void setCommon(Boolean common) {
        this.common = common;
    }
}
