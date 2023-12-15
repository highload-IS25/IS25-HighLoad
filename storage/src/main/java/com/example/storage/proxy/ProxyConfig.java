package com.example.storage.proxy;

import com.example.storage.proxy.sections.ShardingConfig;
import lombok.Data;

@Data
public class ProxyConfig {
    private ShardingConfig sharding;
}
