package com.example.storage;

import com.example.storage.Entities.KeyData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServerComponent{
    private final KeyRepository keyRepository;

    public String get(String key) {
        return keyRepository.getReferenceById(key).getValue();
    }

    public void set(String key, String value) {
        keyRepository.save(new KeyData(key, value));
    }
}

