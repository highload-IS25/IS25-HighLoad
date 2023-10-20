package com.example.storage;

import com.example.storage.Entities.KeyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServerComponent{
    private final KeyRepository keyRepository;

    @Autowired
    public ServerComponent(KeyRepository keyRepository) {
        this.keyRepository = keyRepository;
    }

    public String get(String key) {
        return keyRepository.getReferenceById(key).getValue();
    }

    public void set(String key, String value) {
        keyRepository.save(new KeyData(key, value));
    }
}

