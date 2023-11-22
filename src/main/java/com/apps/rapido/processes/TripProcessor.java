package com.apps.rapido.processes;

import com.apps.rapido.model.Trip.Location;
import com.apps.rapido.model.Trip.TripRequest;
import com.apps.rapido.model.enums.Distance;
import com.apps.rapido.model.enums.TripType;
import com.apps.rapido.model.enums.VehicleType;
import com.apps.rapido.repository.UserRepository;
import com.apps.rapido.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.apps.rapido.model.enums.VehicleType.*;


@Service
public class TripProcessor implements TripService {

    @Autowired
    UserRepository userRepository;


    @Override
    public void findUserTrip(TripRequest request) {
        isValiduser(request.getUserId());
        isValidTripRequest(request.getSource(), request.getDestination(), request.getTripType(),request.getVehicleType());
    }



    Boolean isValiduser(String userId) {
        return userRepository.findByUserId(userId);
    }

    Boolean isValidTripRequest(Location source, Location destination, TripType tripType, VehicleType vehicleType) {

        Long distance = checkDistance(source.getCoordinates(),destination.getCoordinates());
        if(distance <= Distance.LOCAL.getValue() && (vehicleType.equals(AUTO) || vehicleType.equals(MINI))) { return true; }
        if(distance <= Distance.INTER_STATE.getValue() && (vehicleType.equals(SUV) || vehicleType.equals(SEDAN))) { return true; }
        if(distance >= Distance.S2S.getValue() && (vehicleType.equals(SUV) || vehicleType.equals(SEDAN))) { return true; }
        return false;
    }

    Long checkDistance(String source, String destination) {
       return (long) 05;
    }

}
