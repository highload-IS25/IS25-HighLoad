package com.example.storage.proxy.sections;

import lombok.Data;

import java.util.List;

@Data
public class ShardingSection {
    private String name;
    private String master;
    private List<String> replicas;
}