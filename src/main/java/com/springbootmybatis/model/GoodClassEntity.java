package com.springbootmybatis.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class GoodClassEntity implements Serializable {

    private long id;
    private Timestamp addTime;
    private boolean deleteStatus;
    private String className;
    private boolean display;
    private int level;
    private boolean recommend;
    private int sequence;
    private long goodsTypeId;
    private long parentId;
    private String seoDescription;
    private String seoKeywords;
    private String iconSys;
    private int iconType;
    private long iconAccId;

    public GoodClassEntity() {
        super();
    }

    public GoodClassEntity(long id, Timestamp addTime, boolean deleteStatus, String className, boolean display, int level, boolean recommend, int sequence, long goodsTypeId, long parentId, String seoDescription, String seoKeywords, String iconSys, int iconType, long iconAccId) {
        super();
        this.id = id;
        this.addTime = addTime;
        this.deleteStatus = deleteStatus;
        this.className = className;
        this.display = display;
        this.level = level;
        this.recommend = recommend;
        this.sequence = sequence;
        this.goodsTypeId = goodsTypeId;
        this.parentId = parentId;
        this.seoDescription = seoDescription;
        this.seoKeywords = seoKeywords;
        this.iconSys = iconSys;
        this.iconType = iconType;
        this.iconAccId = iconAccId;
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

    public boolean isDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public long getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(long goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    public String getIconSys() {
        return iconSys;
    }

    public void setIconSys(String iconSys) {
        this.iconSys = iconSys;
    }

    public int getIconType() {
        return iconType;
    }

    public void setIconType(int iconType) {
        this.iconType = iconType;
    }

    public long getIconAccId() {
        return iconAccId;
    }

    public void setIconAccId(long iconAccId) {
        this.iconAccId = iconAccId;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "id:"+this.id+"addTime: " + this.addTime + ", deleteStatus: " + this.deleteStatus;
    }
}
