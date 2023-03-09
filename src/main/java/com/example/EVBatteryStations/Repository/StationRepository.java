package com.example.EVBatteryStations.Repository;

import com.example.EVBatteryStations.Models.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station,Integer> {


}
