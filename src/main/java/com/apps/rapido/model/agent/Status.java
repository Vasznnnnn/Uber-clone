package com.apps.rapido.model.agent;

import lombok.Data;

@Data
public class Status {

    private Boolean newTrip;

    private Boolean onGoingTrip;

    private Boolean isAccepted;

    public Status() {};

    public Status(Boolean newTrip, Boolean onGoingTrip, Boolean isAccepted) {
        this.newTrip = newTrip;
        this.onGoingTrip = onGoingTrip;
        this.isAccepted = isAccepted;
    };

}
