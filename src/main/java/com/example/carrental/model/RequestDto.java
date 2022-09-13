package com.example.carrental.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestDto {

    private int Id;

    private String name;

    private String  number;

    private String bookingStatus;

    private int offset;

    private  int limit;

    private int count;
}
