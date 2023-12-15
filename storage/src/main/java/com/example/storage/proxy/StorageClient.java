package com.example.storage.proxy;

public interface StorageClient {
    String routeRequest(String host, String key);
}