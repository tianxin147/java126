package com.db.mapper;

import com.db.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface CarMapper extends JpaRepository<Car,Long> {


}
