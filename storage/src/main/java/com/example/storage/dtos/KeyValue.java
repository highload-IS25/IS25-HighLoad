package com.example.storage.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@AllArgsConstructor
@Getter
@RedisHash("key-value")
public class KeyValue {
    @Id
    private String key;
    private String value;
}
