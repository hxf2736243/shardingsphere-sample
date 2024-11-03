package com.boxer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

public class ShardingSphereConfig {

    @Value("classpath:sharding.yml")
    private Resource shardingYml;


}
