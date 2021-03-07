package com.db.controller;



import com.db.commons.ResultMpdel;
import com.db.model.Car;
import com.db.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("car")
public class CarController {
    @Autowired
    private CarService carService;
    @RequestMapping("fianAll")
    public ResultMpdel fianAll(){
        ResultMpdel mpdel = new ResultMpdel();
        List<Car> list = carService.fianAll();
        mpdel.setData(list):
        return mpdel;
    }

}
