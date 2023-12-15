package com.example.storage.proxy;

import com.example.storage.proxy.sections.ShardingConfig;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ProxyConfig.class)
public class AppConfig {
    @Bean
    public ShardingConfig shardingConfig(ProxyConfig proxyConfig) {
        return proxyConfig.getSharding();
    }
}


