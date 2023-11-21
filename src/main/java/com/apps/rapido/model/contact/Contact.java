package com.apps.rapido.model.contact;


import lombok.Data;

@Data
public class Contact {

    private String contactName;
    private PhoneNumber contactNumber;

    private ContactType contactType;
    public Contact(String contactName, PhoneNumber contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public PhoneNumber getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(PhoneNumber contactNumber) {
        this.contactNumber = contactNumber;
    }
}
