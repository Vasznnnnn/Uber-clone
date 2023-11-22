package com.apps.rapido.model.user;


import com.apps.rapido.model.contact.PhoneNumber;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
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

}
