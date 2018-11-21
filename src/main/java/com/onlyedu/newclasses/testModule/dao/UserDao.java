package com.onlyedu.newclasses.testModule.dao;

import com.onlyedu.newclasses.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Andy
 * @date 2018/11/20 17:47
 */
@Repository
@Mapper
public interface UserDao {

    int insert(User user);
    List<User> selectAllUser();
}
