package com.svv.jpa3.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.svv.jpa3.entity.Vehicle;

@NoRepositoryBean
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

}
