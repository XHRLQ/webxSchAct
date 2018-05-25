package com.luoqing.learning.app1.model;

import java.util.Date;
import java.util.List;

public class Client {
    private long id;
    private String name;
    private String pswd;
    private String email;//注册账号
    private String institution;//学校
    private String gender;
    private int age;
    private String imgUrl;
    private int isAuthenticated;
    private int status=0;//激活状态
    private String validateCode;
    private Date registerTime;
    private Date lastActivateTime;
    private List<Activity> myInitiateActivity;
    private List<ClientActivity> clientActivities;

    public Date getLastActivateTime() {
        return lastActivateTime;
    }

    public void setLastActivateTime(Date lastActivateTime) {
        this.lastActivateTime = lastActivateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getIsAuthenticated() {
        return isAuthenticated;
    }

    public void setIsAuthenticated(int isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }

    public List<Activity> getMyInitiateActivity() {
        return myInitiateActivity;
    }

    public void setMyInitiateActivity(List<Activity> myInitiateActivity) {
        this.myInitiateActivity = myInitiateActivity;
    }

    public List<ClientActivity> getClientActivities() {
        return clientActivities;
    }

    public void setClientActivities(List<ClientActivity> clientActivities) {
        this.clientActivities = clientActivities;
    }
}

