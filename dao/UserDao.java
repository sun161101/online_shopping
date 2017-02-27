package com.sun.online_shopping.dao;

import com.sun.online_shopping.mapper.UserMapper;
import com.sun.online_shopping.model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by zmzy on 2017/2/23.
 */
@Repository
public class UserDao implements IUserDao {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public User load(int id) {
        return userMapper.load(id);
    }
}
