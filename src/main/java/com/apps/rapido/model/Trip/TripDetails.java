package com.apps.rapido.model.Trip;

import com.apps.rapido.model.agent.Agent;
import com.apps.rapido.model.user.UserLocation;
import lombok.Data;

import java.io.Serializable;

@Data
public class TripDetails implements Serializable {

    private Boolean isAccepted;

    private Agent agentDetails;

    private Long userPin;

    private UserLocation source;

    private UserLocation destination;

    public TripDetails() {
    }

    public TripDetails(Boolean isAccepted, Agent agentDetails, Long userPin, UserLocation source, UserLocation destination) {
        this.isAccepted = isAccepted;
        this.agentDetails = agentDetails;
        this.userPin = userPin;
        this.source = source;
        this.destination = destination;
    };

}
