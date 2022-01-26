package com.air.baggageservice.controller;

import com.air.baggageservice.model.BaggageRequest;
import com.air.baggageservice.model.BaggageResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("baggage")
public class BaggageController {

    //http://localhost:9001/baggage/bag/1
    @GetMapping("bag/{baggageID}")
    public BaggageResponse getbag(@PathVariable("baggageID") int baggageID){
        BaggageResponse baggageResponse = new BaggageResponse();
        baggageResponse.setBaggageName("Paid Baggage");
        return baggageResponse;
    }

   //http://localhost:9001/baggage/details?baggageID=1&baggageName="GST"
    @GetMapping("details")
    public BaggageResponse getbaggageDetails(@RequestParam int baggageID, @RequestParam String baggageName){
        BaggageResponse baggageResponse = new BaggageResponse();
        baggageResponse.setBaggageName("Paid Baggage");
        return baggageResponse;
    }
}
