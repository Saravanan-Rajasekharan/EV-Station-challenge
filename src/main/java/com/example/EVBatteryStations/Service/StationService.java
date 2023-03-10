package com.example.EVBatteryStations.Service;

import com.example.EVBatteryStations.Models.Station;
import com.example.EVBatteryStations.Repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class StationService {

    @Autowired
    StationRepository stationRepository;

    public List<Station> getAllStations(){
        List<Station> stationList= stationRepository.findAll();
        return stationList;
    }

    public Station getStationById(Integer id ) {
        Station station = stationRepository.findById(id).get();
        return station;
    }

    public String addStation(Station station){
        stationRepository.save(station);
        return "Station added successfully!";
    }

    public String editStation(Integer id,Station station){

        Station updatedStation = stationRepository.findById(id).get();
        updatedStation.setName(station.getName());
        updatedStation.setImage(station.getImage());
        updatedStation.setAddress(station.getAddress());
        updatedStation.setPricing(station.getPricing());


        stationRepository.save(updatedStation);

        return "Updated station";
    }

    public String deleteStation(Integer id){
        stationRepository.deleteById(id);
        return "Station deleted successfully!";
    }

}
