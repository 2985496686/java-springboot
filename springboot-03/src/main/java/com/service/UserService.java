package com.service;

public interface UserService {

    /**
     * 添加两个user，测试事务机制
     * @param name1
     * @param name2
     */
    void insertTwo(String name1,String name2);
}
