package com.air.gulfstreamsearchservice.service;

import com.air.supply.flights.model.Baggage;
import com.air.supply.flights.model.FlightResponse;
import com.air.supply.flights.model.RestTemplateVO;
import com.air.supply.flights.model.SeatMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FlightSearchService {

    @Autowired
    private RestTemplate restTemplate;
    public RestTemplateVO getDetails(){
        Baggage baggage = new Baggage();
        baggage.setBaggageID(1);
        baggage.setBaggageCategory("PAID");

        FlightResponse flightResponse = new FlightResponse();
        flightResponse.setAirlineID(1);
        flightResponse.setAirlineName("AA");

        SeatMap seatMap = restTemplate.getForObject("http://localhost:9001/baggage/details?baggageID=1&baggageName=\"GST\"", SeatMap.class);

        RestTemplateVO restTemplateVO = new RestTemplateVO();
        restTemplateVO.setBaggage(baggage);
        restTemplateVO.setSeatMap(seatMap);
        restTemplateVO.setFlightResponse(flightResponse);
        return restTemplateVO;
    }
}
