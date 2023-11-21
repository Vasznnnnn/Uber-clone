package com.apps.rapido.model.Trip;

import com.apps.rapido.model.contact.Contact;
import com.apps.rapido.model.user.UserLocation;

import java.io.Serializable;

public class TripRequest implements Serializable {

    private String userId;
    private String userName;
    private Contact contact;
    private UserLocation source;
    private UserLocation destination;
    private TripType tripType;
    private VehicleType vehicleType;

    public TripRequest(String userId, String userName, Contact contact, UserLocation source, UserLocation destination) {
        this.userId = userId;
        this.userName = userName;
        this.contact = contact;
        this.source = source;
        this.destination = destination;
    };

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public UserLocation getSource() {
        return source;
    }

    public void setSource(UserLocation source) {
        this.source = source;
    }

    public UserLocation getDestination() {
        return destination;
    }

    public void setDestination(UserLocation destination) {
        this.destination = destination;
    }

    public TripType getTripType() { return tripType; }

    public void setTripType(TripType tripType) { this.tripType = tripType; }

    public VehicleType getVehicleType() { return vehicleType; }

    public void setVehicleType(VehicleType vehicleType) { this.vehicleType = vehicleType; }
}
