package com.apps.rapido.model.contact;


import com.apps.rapido.model.enums.ContactType;
import lombok.Data;

@Data
public class Contact {

    private String contactName;
    private PhoneNumber contactNumber;

    private ContactType contactType;
    public Contact(String contactName, PhoneNumber contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    };

}
