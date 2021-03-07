package com.db.service.impl;


import com.db.mapper.CarMapper;
import com.db.model.Car;
import com.db.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {
        @Autowired
        private CarMapper carMapper;

        @Override
        public List<Car> fianAll() {
                return carMapper.findAll();
        }
}
