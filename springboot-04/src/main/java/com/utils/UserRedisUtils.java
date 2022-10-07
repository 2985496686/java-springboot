package com.utils;

import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class UserRedisUtils {
    @Autowired
    private RedisTemplate redisTemplate;
    public void setUser(User user){

    }
}
