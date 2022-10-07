package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

import javax.annotation.Resource;

@Configuration
public class RedisConfig {

    @Resource
    private RedisConnectionFactory factory;
    @Bean
    public RedisTemplate<String,String> redisTemplate(){
        RedisTemplate<String,String> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(factory);
        redisTemplate.setHashKeySerializer(RedisSerializer.string());
        redisTemplate.setKeySerializer(RedisSerializer.string());
       // redisTemplate.setValueSerializer(RedisSerializer.string());
        redisTemplate.setHashValueSerializer(RedisSerializer.string());
        return redisTemplate;
    }
}
