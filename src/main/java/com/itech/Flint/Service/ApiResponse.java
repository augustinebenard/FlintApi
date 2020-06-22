package com.itech.Flint.Service;

public class ApiResponse<T> {
    String response;
    String message;
    T data;

    public ApiResponse(String response, String message, T data) {
        this.response = response;
        this.message = message;
        this.data = data;
    }

    public ApiResponse(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public ApiResponse(String response, String message) {
        this.response = response;
        this.message = message;
    }

    public ApiResponse(String message) {
        this.message = message;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
