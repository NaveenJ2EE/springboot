package com.naveen.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.flightreservation.entity.Reservation;

public interface ReservationRepo extends JpaRepository<Reservation, Long>{

}
