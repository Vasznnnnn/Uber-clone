package com.apps.rapido.service;

import com.apps.rapido.model.Trip.TripRequest;

public interface TripService {

    void findUserTrip(TripRequest request);
}
