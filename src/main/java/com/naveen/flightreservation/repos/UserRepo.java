package com.naveen.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.flightreservation.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{
    
	
	User findByEmail(String email);

}
