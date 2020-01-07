package com.example.cnpm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("mail")
    @Expose
    private String mail;
    @SerializedName("pass")
    @Expose
    private String pass;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("birthday")
    @Expose
    private String birthday;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("isactive")
    @Expose
    private Boolean isactive;
    @SerializedName("createat")
    @Expose
    private String createat;
    @SerializedName("isdeleted")
    @Expose
    private Boolean isdeleted;
    public User(String mail, String pass, String username, String birthday, String phoneNumber, String firstname, String lastname, Boolean isactive, String createat, Boolean isdeleted) {
        this.mail = mail;
        this.pass = pass;
        this.username = username;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.isactive = isactive;
        this.createat = createat;
        this.isdeleted = isdeleted;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Boolean getIsactive() {
        return isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }

    public String getCreateat() {
        return createat;
    }

    public void setCreateat(String createat) {
        this.createat = createat;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
}
