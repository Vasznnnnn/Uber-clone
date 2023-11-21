package com.apps.rapido.model.user;


import com.apps.rapido.model.contact.PhoneNumber;

import java.io.Serializable;
import java.util.Date;


public class User implements Serializable{

    private String userId;
    private String userName;
    private String userEmail;
    private String gender;
    private Date dateOfBirth;
    private PhoneNumber phoneNumber;

    public User() {};

    public User(String userId, String userEmail, String gender, Date dateOfBirth, PhoneNumber phoneNumber) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    };

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() { return dateOfBirth; }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() { return userName; }

    public void setUserName(String userName) { this.userName = userName; }
}
