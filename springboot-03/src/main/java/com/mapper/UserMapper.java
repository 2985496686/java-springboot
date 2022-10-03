package com.mapper;


import com.eneity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    /**
     * 添加用户
     * @param name  用户名
     * @return
     */
    int insertUser(String name);

    /**
     * 查找全部用户
     * @return
     */
    List<User> getUser();

    /**
     *根据id查找用户
     * @param id
     * @return
     */
    User getUserById(int id);
}
