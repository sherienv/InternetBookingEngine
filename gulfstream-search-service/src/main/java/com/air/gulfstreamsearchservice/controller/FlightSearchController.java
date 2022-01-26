package com.air.gulfstreamsearchservice.controller;

import com.air.gulfstreamsearchservice.service.FlightSearchService;
import com.air.supply.flights.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("search")
public class FlightSearchController {

    @Autowired
    private FlightSearchService flightSearchService;

    @RequestMapping(value="v2/GOCS", method = RequestMethod.POST)
    public FlightResponse GOCSSearch(@RequestBody FlightSearchModel flightSearchModel){
        FlightResponse flightResponse = new FlightResponse();
        flightResponse.setAirlineID(1234);
        flightResponse.setAirlineName("AA");
        return flightResponse;
    }

    //localhost:9000/search/v2/flightsearch
    /*
    {
        "from": "LHR",
        "to": "LAX"
 }
     */
    @PostMapping("v2/flightsearch")
    public FlightResponse FSSearch(@RequestBody FlightSearchModel flightSearchModel){
        FlightResponse flightResponse = new FlightResponse();
        flightResponse.setAirlineID(1234);
        flightResponse.setAirlineName("AA");
        return flightResponse;
    }

    /*
    localhost:9000/search/v2/bagAndSeat
    {
        "from": "LHR",
        "to": "LAX"
 }
     */
    @PostMapping("v2/bagAndSeat")
    public RestTemplateVO SearchforBaggageAndSeat(@RequestBody FlightSearchModel flightSearchModel){
        return flightSearchService.getDetails();
    }


}
