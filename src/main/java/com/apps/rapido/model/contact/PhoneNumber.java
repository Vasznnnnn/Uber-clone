package com.apps.rapido.model.contact;

import lombok.Data;

@Data
public class PhoneNumber {

    private String countryCode;
    private String number;

    public PhoneNumber(String countryCode, String number) {
        this.countryCode = countryCode;
        this.number = number;
    };

    public PhoneNumber(String s) {
        this(s.split("-")[0].toString(), s.split("-")[1].toString());
    }
}
