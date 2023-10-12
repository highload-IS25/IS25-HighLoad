package com.example.storage;

public interface StorageService {
    String get(String key);

    void set(String key, String value);
}
