package com.knowledge.health.module.me.model.entity;

/**
 * Created by RudyJun on 2017/1/9.
 */

public class PersonInfo {

    private String access_token;
    //       登录帐号
    private String account;
    //       头像地址
    private String avatar;
    //       用户主页域名
    private String domain;
    //       邮箱
    private String email;
    //       性别，1：男 0：女
    private int gender;
    private int id;
    //       用户积分
    private int integral;
    private int isemail;
    private int isphone;
    //       QQ ID
    private String qqid;
    private boolean status;
    private long time;
    //      个性标题
    private String title;
    //      微博ID
    private int weiboid;
    private String msg;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public int getIsemail() {
        return isemail;
    }

    public void setIsemail(int isemail) {
        this.isemail = isemail;
    }

    public int getIsphone() {
        return isphone;
    }

    public void setIsphone(int isphone) {
        this.isphone = isphone;
    }

    public String getQqid() {
        return qqid;
    }

    public void setQqid(String qqid) {
        this.qqid = qqid;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWeiboid() {
        return weiboid;
    }

    public void setWeiboid(int weiboid) {
        this.weiboid = weiboid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "access_token='" + access_token + '\'' +
                ", account='" + account + '\'' +
                ", avatar='" + avatar + '\'' +
                ", domain='" + domain + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", id=" + id +
                ", integral=" + integral +
                ", isemail=" + isemail +
                ", isphone=" + isphone +
                ", qqid='" + qqid + '\'' +
                ", status=" + status +
                ", time=" + time +
                ", title='" + title + '\'' +
                ", weiboid=" + weiboid +
                ", msg='" + msg + '\'' +
                '}';
    }
}
