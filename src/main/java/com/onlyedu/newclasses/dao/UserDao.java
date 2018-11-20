package com.onlyedu.newclasses.dao;

import com.onlyedu.newclasses.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Andy
 * @date 2018/11/20 17:47
 */
@Mapper
public interface UserDao {

    int insert(User user);
    List<User> getUserLsit(User user);
}
