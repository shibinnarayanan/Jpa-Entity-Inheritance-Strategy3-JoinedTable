package com.svv.jpa3.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.svv.jpa3.entity.Truck;

@Repository
public interface TruckRepository extends VehicleRepository{

}
