package com.naveen.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.flightreservation.entity.Passenger;

public interface PassengerRepo extends JpaRepository<Passenger, Long> {

}
