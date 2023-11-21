package com.apps.rapido.model.user;

public class UserLocation {

    private String address;
    private String coordinates;

    public UserLocation(String address, String coordinates) {
        this.address = address;
        this.coordinates = coordinates;
    }

    public String getAddress() { return address; }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
}
