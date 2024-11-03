package com.boxer.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 提供挡板
 */
@Configuration
public class FeignClientConfig {
//    @ConditionalOnProperty(name="feign-client.debug",havingValue = "true")
//    @Primary
//    public XXApi xxApi(){
//        return new XXApiImpl();
//    }

}
