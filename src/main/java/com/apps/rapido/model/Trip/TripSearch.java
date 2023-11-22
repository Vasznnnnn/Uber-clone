package com.apps.rapido.model.Trip;

import lombok.Data;

@Data
public class TripSearch {

    private String agentId;
    private Location agentLocation;

    public TripSearch(String agentId, Location agentLocation) {
        this.agentId = agentId;
        this.agentLocation = agentLocation;
    }
}
