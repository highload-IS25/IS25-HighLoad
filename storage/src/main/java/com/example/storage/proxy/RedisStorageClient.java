package com.example.storage.proxy;

import org.springframework.stereotype.Service;

@Service
public class RedisStorageClient implements StorageClient {

    @Override
    public String routeRequest(String host, String key) {
        return "Response from Redis at " + host + " for key " + key;
    }
}
