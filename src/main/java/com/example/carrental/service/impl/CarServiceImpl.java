package com.example.carrental.service.impl;

import com.example.carrental.entity.Car;
import com.example.carrental.model.RequestDto;
import com.example.carrental.model.ResponseDto;
import com.example.carrental.repository.CarRepository;
import com.example.carrental.service.CarService;
import com.example.carrental.utility.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public APIResponse create(RequestDto requestDto) {
        Car car = new Car();
        car = putDataInEntity(car, requestDto);
        carRepository.save(car);
        return new APIResponse("Success", "Successfully created", 200, null);
    }

//    @Override
//    public APIResponse partialUpdateName(RequestDto requestDto) {
//        return null;
//    }

    private Car putDataInEntity(Car car, RequestDto requestDto) {
        car.setName(requestDto.getName());
        car.setNumber(requestDto.getNumber());
        car.setBookingStatus(requestDto.getBookingStatus());
        return car;
    }

    @Override
    public APIResponse partialUpdateName(RequestDto requestDto, int id) {
        Car car = carRepository.findById(id);
//        car.setNumber(requestDto.getNumber());
//        car.setName(requestDto.getName());
        car.setBookingStatus(requestDto.getBookingStatus());
        carRepository.save(car);
        return new APIResponse("Success", "Successfully updated", 200, null);
    }

    @Override
    public APIResponse get(int Id) {
        Car car = carRepository.findById(Id);
        return new APIResponse("Success", null, 200, getDataFromEntity(car));
    }

    private ResponseDto getDataFromEntity(Car car) {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setName(car.getName());
        responseDto.setNumber(car.getNumber());
        responseDto.setBookingStatus(car.getBookingStatus());
        return responseDto;

    }


    @Override
    public APIResponse delete(int Id) {
        Car car = carRepository.findById(Id);
        carRepository.delete(car);
        return new APIResponse("Success", "Successfully deleted", 200, null);
    }

    @Override
    public APIResponse getCarData(RequestDto requestDto) {
        String name = requestDto.getName();
        if (name == null || name == "" || Objects.isNull(name)) {

            name = "0";
        }
        String bookingStatus = requestDto.getBookingStatus();
        if (bookingStatus == null || bookingStatus == "" || Objects.isNull(bookingStatus)) {

            bookingStatus = "0";
        }
        String number = requestDto.getNumber();
        if (number == null || number == "" || Objects.isNull(number)) {

            number = "0";
        }
        List<Car> car = carRepository.getCarData(requestDto.getOffset(), requestDto.getLimit(),name, bookingStatus, number);
        int count = carRepository.getCount(name, bookingStatus, number);
        List<ResponseDto> responseDto = new ArrayList<>();
        if (!car.isEmpty()) {
            responseDto = car.stream().map(this::getDataFromEntity).collect(Collectors.toList());
            requestDto.setCount(count);
            return new APIResponse("Success", "success", 200, count,responseDto);

        }
        else {
            return new APIResponse("Not found", "success", 200, count,responseDto);
        }

    }

      public APIResponse getNData(RequestDto requestDto){

          String name = requestDto.getName();
          if (name == null || name == "" || Objects.isNull(name)) {
              name = "name";
          }

        List<Car> car =carRepository.getNData(name);
        List<ResponseDto> responseDto = new ArrayList<>();
        if(!car.isEmpty()){
            responseDto = car.stream().map(this::getDataFromEntity).collect(Collectors.toList());
            return new APIResponse("Success", "success", 200, responseDto);

        }
        else {
            return new APIResponse("Not found", "success", 200, responseDto);
        }
        }

    @Override
    public APIResponse getNumbData(RequestDto requestDto) {
        String number = requestDto.getNumber();
        if (number == null || number == "" || Objects.isNull(number)) {
            number = "7";
        }
        List<Car> car = carRepository.getNumbData(number);
        List<ResponseDto> responseDto = new ArrayList<>();
        if (!car.isEmpty()) {
            responseDto = car.stream().map(this::getDataFromEntity).collect(Collectors.toList());
            return new APIResponse("Success", "success", 200, responseDto);
        }
    else
        {

            return new APIResponse("Not found", "Success", 200, responseDto);
        }
    }

    @Override
    public APIResponse getByBookingStatus(RequestDto requestDto) {
        String bookingStatus = requestDto.getBookingStatus();
        if(bookingStatus == null || bookingStatus == "" || Objects.isNull(bookingStatus)){
            bookingStatus = "0";
        }
        List<Car> car = carRepository.getByBookingStatus(bookingStatus);
        List<ResponseDto> responseDto = new ArrayList<>();
        if(!car.isEmpty()){
            responseDto = car.stream().map(this::getDataFromEntity).collect(Collectors.toList());
            return new APIResponse("Success", "success", 200, responseDto);
        }
        else{
            return new APIResponse("Not found", "success", 200, responseDto);
        }

    }

    @Override
    public APIResponse getAllCarData(RequestDto requestDto) {

        String name = requestDto.getName();
        String bookingStatus = requestDto.getBookingStatus();
        String number = requestDto.getNumber();

        //all present
        if(requestDto.getName()!=null && requestDto.getNumber()!=null && requestDto.getBookingStatus()!=null) {


        }

        //solo(Number)
        if((requestDto.getNumber()!=null && (requestDto.getName()==null && requestDto.getBookingStatus()==null))) {

    }
        //solo(Name)
        if(requestDto.getName()!=null && (requestDto.getBookingStatus()==null && requestDto.getNumber()==null)){
        }

        //bookingStatus+name
        if(requestDto.getBookingStatus()!=null && requestDto.getName()!=null && requestDto.getNumber()==null){

        }

        //bookingStatus+number
        if(requestDto.getBookingStatus()!=null && requestDto.getNumber()!=null && requestDto.getName()==null){

        }

        //name+number
        if(requestDto.getName()!=null && requestDto.getNumber()!=null && requestDto.getBookingStatus()==null){

        }
        List<Car> car = carRepository.getAllCarData(name, bookingStatus, number);
        List<ResponseDto> responseDto = new ArrayList<>();
        if(!car.isEmpty()){
            responseDto = car.stream().map(this::getDataFromEntity).collect(Collectors.toList());
            return new APIResponse("Success", "success", 200, responseDto);
        }
        else{
            return new APIResponse("Not found", "success", 200, responseDto);
        }
    }

    @Override
    public Page<Car> findPaginated(int pageNo, int pageSize) {

        Pageable pageable = PageRequest.of(pageNo, pageSize);
        return this.carRepository.findAll(pageable);

    }

    @Override
    public APIResponse sortData(RequestDto requestDto) {
        int id = requestDto.getId();
        List<Car> obj = carRepository.sortData(id);

        obj = obj.stream().sorted().collect(Collectors.toList());
        return new APIResponse("Success", "success", 200, obj);

    }
}



