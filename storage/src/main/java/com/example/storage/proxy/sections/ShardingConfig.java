package com.example.storage.proxy.sections;

import lombok.Data;

import java.util.List;

@Data
public class ShardingConfig {
    private List<ShardingSection> sections;
}

