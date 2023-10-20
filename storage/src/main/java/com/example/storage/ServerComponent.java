package com.example.storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServerComponent implements StorageInterface {
    private final StorageInterface storageInterface;

    @Autowired
    public ServerComponent(StorageInterface storageInterface) {
        this.storageInterface = storageInterface;
    }

    @Override
    public String get(String key) {
        return storageInterface.get(key);
    }

    @Override
    public void set(String key, String value) {
        storageInterface.set(key, value);
    }
}

