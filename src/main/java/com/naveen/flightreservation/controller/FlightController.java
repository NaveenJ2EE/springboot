package com.naveen.flightreservation.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.naveen.flightreservation.entity.Flight;
import com.naveen.flightreservation.repos.FlightRepo;


@Controller
public class FlightController {
	
	@Autowired
	FlightRepo flightRepo;
	
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from,
			@RequestParam("to") String to,
			@RequestParam("departureDate") 
	        @DateTimeFormat(pattern="MM-dd-yyyy") 
	         Date departureDate,ModelMap modelMap) 
	{
		
		List<Flight> flights=flightRepo.findFlights(from, to, departureDate);
		
		modelMap.addAttribute("flights", flights);
		
		
	 return "displayFlight";
	}

}
