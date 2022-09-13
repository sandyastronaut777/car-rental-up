package com.example.carrental.utility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class APIResponse {

    private String status;

    private String message;

    private int statusCode;

    private Object object;

    private int count;

    public APIResponse(String status, String message, int statusCode, Object object) {
        this.status = status;
        this.message = message;
        this.statusCode = statusCode;
        this.object = object;
    }

    public APIResponse(String status, String message, int statusCode, int count, Object object) {
        this.status = status;
        this.message = message;
        this.statusCode = statusCode;
        this.count = count;
        this.object = object;
    }
}
