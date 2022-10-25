package com.svv.jpa3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.svv.jpa3.entity.Tank;
import com.svv.jpa3.entity.Truck;
import com.svv.jpa3.repo.TruckRepository;


@RestController
public class VehicleController {
	
	@Autowired
	TruckRepository truckRepo;
	
//	Testing json
//	{
//	     "name":"Benz", "seats":5,  "maxLoad":1500,  "sleeperCab":true
//	}
	
	@PostMapping("/save/truck")
	ResponseEntity<Truck> createTruck(@RequestBody Truck truck)
	{
		System.out.println(truck);
		
		truck = truckRepo.save(truck);
		
		return new ResponseEntity<>(truck, HttpStatus.CREATED);
	}
//	Testing json
//	{
//	     "name":"Tank-A1", "seats":5,  "firePower":1000
//	}
	@PostMapping("/save/tank")
	ResponseEntity<Tank> createTruck(@RequestBody Tank tank)
	{
		System.out.println(tank);
		
		tank = truckRepo.save(tank);
		
		return new ResponseEntity<>(tank, HttpStatus.CREATED);
	}

}
