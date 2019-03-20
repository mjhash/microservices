package com.practice.moviecatalogueservice.core;

import java.util.HashMap;

public class Response<T> {
    public HashMap<T, T> response;

    public HashMap<T, T> getResponse() {
        return response;
    }

    public void setResponse(HashMap<T, T> response) {
        this.response = response;
    }

}
