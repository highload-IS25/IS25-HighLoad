package com.example.storage.proxy;

import com.example.storage.proxy.sections.ShardingConfig;
import com.example.storage.proxy.sections.ShardingSection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShardingProxyService implements StorageClient {

    private final ShardingConfig shardingConfig;

    @Autowired
    public ShardingProxyService(ShardingConfig shardingConfig) {
        this.shardingConfig = shardingConfig;
    }

    @Override
    public String routeRequest(String host, String key) {
        ShardingSection firstSection = shardingConfig.getSections().get(0);
        return "Routing to master: " + firstSection.getMaster() + " for key " + key;
    }
}

