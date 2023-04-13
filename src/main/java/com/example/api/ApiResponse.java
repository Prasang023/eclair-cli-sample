package com.example.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;

import java.util.Collections;
import java.util.List;

@Introspected
final public class ApiResponse<T> {

    public List<T> items = Collections.emptyList();

    @Override
    public String toString() {
        return "ApiResponse{" +
                "items=" + items +
                '}';
    }
}