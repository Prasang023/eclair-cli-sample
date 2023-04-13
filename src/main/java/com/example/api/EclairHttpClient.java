package com.example.api;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("${stackoverflow.api.url}")
public interface EclairHttpClient {
        @Get("/getinfo")
        ApiResponse<Info> getinfo();
}