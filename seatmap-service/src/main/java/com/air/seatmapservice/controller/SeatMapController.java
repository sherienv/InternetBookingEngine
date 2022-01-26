package com.air.seatmapservice.controller;

import com.air.seatmapservice.model.SeatMapRequest;
import com.air.seatmapservice.model.SeatMapResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("seatmap")
public class SeatMapController {

    @GetMapping("getDetails")
    public SeatMapResponse getSeatMapDetails(@RequestBody SeatMapRequest seatMapRequest){
        SeatMapResponse seatMapResponse = new SeatMapResponse();
        seatMapResponse.setSeatmapID(seatMapRequest.getSeatmapID());
        return seatMapResponse;
    }


}
