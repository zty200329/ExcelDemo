package com.excel.dao;

import com.excel.entity.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    User selectByPrimaryKey(Integer uid);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}