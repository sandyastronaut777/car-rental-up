package com.example.carrental.controller;

import com.example.carrental.entity.Car;
import com.example.carrental.model.RequestDto;
import com.example.carrental.repository.CarRepository;
import com.example.carrental.service.CarService;
import com.example.carrental.utility.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
//@RequestMapping("/car")
public class APIController {

    @Autowired
    CarService carService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    APIResponse create(@RequestBody RequestDto requestDto) {

        return carService.create(requestDto);
    }

    @RequestMapping(value = "/car/update/{id}", method = RequestMethod.POST)
    APIResponse partialUpdateName(@PathVariable int id, @RequestBody RequestDto requestDto) {
            return carService.partialUpdateName(requestDto, id);
    }

    @GetMapping("/get/{id}")
    APIResponse get(@PathVariable int id) {

        return carService.get(id);
    }


    @RequestMapping(value = "/car/getCar/", method = RequestMethod.POST)
    APIResponse getBookingStatus(@RequestBody RequestDto requestDto) {
        return carService.getCarData(requestDto);
    }

    @RequestMapping(value = "/car/delete/{id}", method = RequestMethod.DELETE)
    APIResponse delete(@PathVariable int id) {

        return carService.delete(id);
    }

    @RequestMapping(value = "/getCarData", method = RequestMethod.POST)
    APIResponse getCarData(@RequestBody RequestDto requestDto) {
        return carService.getCarData(requestDto);
    }

    @RequestMapping(value = "/gets", method = RequestMethod.POST)
    APIResponse getNData(@RequestBody RequestDto requestDto) {
        return carService.getNData(requestDto);
    }

    @RequestMapping(value = "/getNum", method = RequestMethod.POST)
    APIResponse getNumbData(@RequestBody RequestDto requestDto) {
        return carService.getNumbData(requestDto);
    }

    @RequestMapping(value = "/getBook", method = RequestMethod.POST)
    APIResponse getByBookingStatus(@RequestBody RequestDto requestDto) {
        return carService.getByBookingStatus(requestDto);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.POST)
    APIResponse getAllCarData(@RequestBody RequestDto requestDto) {
        return carService.getAllCarData(requestDto);
    }

    @GetMapping("/{pageNo}")
    public List<Car> getCars(@PathVariable int pageNo) {
        int pageSize = 5;
        Page<Car> page = carService.findPaginated(pageNo, pageSize);
        List<Car> listCars = page.getContent();

        return listCars;
    }
}
