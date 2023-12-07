package com.example.storage.services;

import org.springframework.stereotype.Service;

@Service
public interface ServerComponent {
    void set(String key, String value);

    String get(String key);
}
