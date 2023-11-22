package com.apps.rapido.model.Trip;

import com.apps.rapido.model.contact.Contact;
import com.apps.rapido.model.enums.TripType;
import com.apps.rapido.model.enums.VehicleType;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TripRequest implements Serializable {

    private String userId;
    private String userName;
    private Contact contact;
    private Location source;
    private Location destination;
    private TripType tripType;
    private VehicleType vehicleType;
    private List<TripSearch> nearbyAgents;

    public TripRequest(String userId, String userName, Contact contact, Location source, Location destination, TripType tripType, VehicleType vehicleType, List<TripSearch> nearbyAgents) {
        this.userId = userId;
        this.userName = userName;
        this.contact = contact;
        this.source = source;
        this.destination = destination;
        this.tripType = tripType;
        this.vehicleType = vehicleType;
        this.nearbyAgents = nearbyAgents;
    };
}
