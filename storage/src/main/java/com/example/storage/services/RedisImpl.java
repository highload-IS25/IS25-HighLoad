package com.example.storage.services;

import com.example.storage.dtos.KeyValue;
import com.example.storage.repositories.KeyValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"redis", "cluster"})
public class RedisImpl implements ServerComponent {
    private final KeyValueRepository repository;

    public RedisImpl(@Autowired KeyValueRepository repository) {
        this.repository = repository;
    }

    @Override
    public void set(String key, String value) {
        repository.save(new KeyValue(key, value));
    }

    @Override
    public String get(String key) {
        return repository.findById(key).get().getValue();
    }
}
