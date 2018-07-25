package com.springbootmybatis.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class UserEntity {
    private long id;
    //id,addTime,deleteStatus,MSN,QQ,WW,address,availableBalance,birthday,email,freezeBlance,gold,integral,lastLoginDate
    //lastLoginIp,loginCount,loginDate,loginIp,mobile,password,report,sex,status,telephone,trueName,userName,userRole,user_credit,photo_id
    //store_id,qq_openid,sina_openid,store_quick_menu,parent_id,years,area_id
    private Timestamp addTime;
    private Boolean deleteStatus;
    private String MSN;
    private String QQ;
    private String WW;
    private String address;
    private BigDecimal availableBalance;
    private Timestamp birthday;
    private String email;
    private BigDecimal freezeBlance;
    private Integer gold;
    private Integer integral;
    private Timestamp lastLoginDate;
    private String lastLoginIp;
    private Integer loginCount;
    private Timestamp loginDate;
    private String loginIp;
    private String mobile;
    private String password;
    private Integer report;
    private Integer sex;
    private Integer status;
    private String telephone;
    private String trueName;
    private String userName;
    private String userRole;
    private Integer user_credit;
    private long photo_id;
    private long store_id;
    private String qq_openid;
    private String sina_openid;
    private String store_quick_menu;
    private long parent_id;
    private Integer years;
    private long area_id;

    public UserEntity()
    {
        super();
    }

    public UserEntity(long id, Timestamp addTime, Boolean deleteStatus, String MSN, String QQ, String WW, String address, BigDecimal availableBalance, Timestamp birthday, String email, BigDecimal freezeBlance, Integer gold, Integer integral, Timestamp lastLoginDate, String lastLoginIp, Integer loginCount, Timestamp loginDate, String loginIp, String mobile, String password, Integer report, Integer sex, Integer status, String telephone, String trueName, String userName, String userRole, Integer user_credit, long photo_id, long store_id, String qq_openid, String sina_openid, String store_quick_menu, long parent_id, Integer years, long area_id) {
        super();
        this.id = id;
        this.addTime = addTime;
        this.deleteStatus = deleteStatus;
        this.MSN = MSN;
        this.QQ = QQ;
        this.WW = WW;
        this.address = address;
        this.availableBalance = availableBalance;
        this.birthday = birthday;
        this.email = email;
        this.freezeBlance = freezeBlance;
        this.gold = gold;
        this.integral = integral;
        this.lastLoginDate = lastLoginDate;
        this.lastLoginIp = lastLoginIp;
        this.loginCount = loginCount;
        this.loginDate = loginDate;
        this.loginIp = loginIp;
        this.mobile = mobile;
        this.password = password;
        this.report = report;
        this.sex = sex;
        this.status = status;
        this.telephone = telephone;
        this.trueName = trueName;
        this.userName = userName;
        this.userRole = userRole;
        this.user_credit = user_credit;
        this.photo_id = photo_id;
        this.store_id = store_id;
        this.qq_openid = qq_openid;
        this.sina_openid = sina_openid;
        this.store_quick_menu = store_quick_menu;
        this.parent_id = parent_id;
        this.years = years;
        this.area_id = area_id;
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

    public String getMSN() {
        return MSN;
    }

    public void setMSN(String MSN) {
        this.MSN = MSN;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getWW() {
        return WW;
    }

    public void setWW(String WW) {
        this.WW = WW;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getFreezeBlance() {
        return freezeBlance;
    }

    public void setFreezeBlance(BigDecimal freezeBlance) {
        this.freezeBlance = freezeBlance;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Timestamp getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Timestamp lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Timestamp getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Timestamp loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getReport() {
        return report;
    }

    public void setReport(Integer report) {
        this.report = report;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public Integer getUser_credit() {
        return user_credit;
    }

    public void setUser_credit(Integer user_credit) {
        this.user_credit = user_credit;
    }

    public long getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(long photo_id) {
        this.photo_id = photo_id;
    }

    public long getStore_id() {
        return store_id;
    }

    public void setStore_id(long store_id) {
        this.store_id = store_id;
    }

    public String getQq_openid() {
        return qq_openid;
    }

    public void setQq_openid(String qq_openid) {
        this.qq_openid = qq_openid;
    }

    public String getSina_openid() {
        return sina_openid;
    }

    public void setSina_openid(String sina_openid) {
        this.sina_openid = sina_openid;
    }

    public String getStore_quick_menu() {
        return store_quick_menu;
    }

    public void setStore_quick_menu(String store_quick_menu) {
        this.store_quick_menu = store_quick_menu;
    }

    public long getParent_id() {
        return parent_id;
    }

    public void setParent_id(long parent_id) {
        this.parent_id = parent_id;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public long getArea_id() {
        return area_id;
    }

    public void setArea_id(long area_id) {
        this.area_id = area_id;
    }
}
