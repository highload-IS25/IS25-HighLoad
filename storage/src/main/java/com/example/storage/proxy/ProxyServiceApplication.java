package com.example.storage.proxy;

import com.example.storage.proxy.sections.ShardingConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProxyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProxyServiceApplication.class, args);
    }

    @Autowired
    private ShardingConfig shardingConfig;

    @Bean
    public ShardingProxyService shardingProxyService() {
        return new ShardingProxyService(shardingConfig);
    }
}
