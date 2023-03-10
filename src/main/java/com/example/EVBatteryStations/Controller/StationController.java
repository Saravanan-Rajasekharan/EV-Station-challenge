package com.example.EVBatteryStations.Controller;

import com.example.EVBatteryStations.Models.Station;
import com.example.EVBatteryStations.Service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/station")
public class StationController {

    @Autowired
    StationService stationService;

    @GetMapping("/getAllStations")
    public List<Station> getAllStations(){
        List<Station> stationList = stationService.getAllStations();
        return stationList;
    }

    @GetMapping("/show/{id}")
    public Station getStationById(@PathVariable("id") Integer id ){
        Station station = stationService.getStationById(id);
        return station;
    }

    @PostMapping("/addStation")
    public String addStation(@RequestBody Station station){
        return stationService.addStation(station);
    }


    @PutMapping("/{id}/edit")
    public String editStation(@RequestBody Station station, @PathVariable Integer id ){
        return stationService.editStation(id,station);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteStation(@PathVariable("id")Integer id){
        return stationService.deleteStation(id);
    }


}
