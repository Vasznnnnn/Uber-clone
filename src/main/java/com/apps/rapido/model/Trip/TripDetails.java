package com.apps.rapido.model.Trip;

import com.apps.rapido.model.agent.Agent;
import lombok.Data;

import java.io.Serializable;

@Data
public class TripDetails implements Serializable {

    private Boolean isAccepted;
    private Agent agentDetails;
    private Long userPin;
    private Location source;
    private Location destination;

    public TripDetails() {
    }

    public TripDetails(Boolean isAccepted, Agent agentDetails, Long userPin, Location source, Location destination) {
        this.isAccepted = isAccepted;
        this.agentDetails = agentDetails;
        this.userPin = userPin;
        this.source = source;
        this.destination = destination;
    };

}
