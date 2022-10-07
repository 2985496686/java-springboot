package com.dao;

import com.google.gson.Gson;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

@Repository
public class UserCacheDao {
    private static final String KEY_PATTERN = "user:%d";

    private Gson gson = new Gson();

    @Autowired
    private RedisTemplate<String,String> redisTemplate;


    public void setUser(User user){
        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
        String key = String.format(KEY_PATTERN,user.getId());
        String userJson = gson.toJson(user);
        opsForValue.set(key,userJson);
    }

    public User getUser(Integer id){
        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
        String key = String.format(KEY_PATTERN,id);
        String userJson = opsForValue.get(key);
        User user = gson.fromJson(userJson, User.class);
        return user;
    }
}
