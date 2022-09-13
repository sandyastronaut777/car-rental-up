package com.example.carrental.service;

import com.example.carrental.entity.Car;
import com.example.carrental.model.RequestDto;
import com.example.carrental.utility.APIResponse;
import org.springframework.data.domain.Page;

public interface CarService {

    APIResponse create(RequestDto requestDto);


    APIResponse partialUpdateName(RequestDto requestDto, int id);

    APIResponse get(int Id);

    APIResponse delete(int Id);


    APIResponse getCarData(RequestDto requestDto);

    APIResponse getNData(RequestDto requestDto);

    APIResponse getNumbData(RequestDto requestDto);

    APIResponse getByBookingStatus(RequestDto requestDto);

    APIResponse getAllCarData(RequestDto requestDto);

    Page<Car> findPaginated(int pageNo, int pageSize);


    APIResponse sortData(RequestDto requestDto);
}
