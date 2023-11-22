package com.apps.rapido.model.Trip;

import lombok.Data;

@Data
public class Location {

    private String address;
    private String coordinates;

    public Location(String address, String coordinates) {
        this.address = address;
        this.coordinates = coordinates;
    };
}
