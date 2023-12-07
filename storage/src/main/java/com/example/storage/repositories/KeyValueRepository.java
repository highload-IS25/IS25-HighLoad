package com.example.storage.repositories;

import com.example.storage.dtos.KeyValue;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;


@Profile({"redis", "cluster"})
public interface KeyValueRepository extends CrudRepository<KeyValue, String> {
}
