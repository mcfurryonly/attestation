package org.example.service;

import org.example.entity.Flight;

import java.util.List;

public interface FlightFilterBuilder {

    List<Flight> build();

    FlightFilterBuilder filterDepartureBeforeNow();

    FlightFilterBuilder filterArrivalBeforeDeparture();

    FlightFilterBuilder filterSumTimeOnGroundMoreThanTwoHours();

}
