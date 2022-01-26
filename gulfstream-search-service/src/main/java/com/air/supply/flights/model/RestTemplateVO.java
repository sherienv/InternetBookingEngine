package com.air.supply.flights.model;

public class RestTemplateVO {
    private Baggage baggage;
    private SeatMap seatMap;
    private FlightResponse flightResponse;

    public Baggage getBaggage() {
        return baggage;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public SeatMap getSeatMap() {
        return seatMap;
    }

    public void setSeatMap(SeatMap seatMap) {
        this.seatMap = seatMap;
    }

    public FlightResponse getFlightSearchRequest() {
        return flightResponse;
    }

    public void setFlightResponse(FlightResponse flightResponse) {
        this.flightResponse = flightResponse;
    }
}
