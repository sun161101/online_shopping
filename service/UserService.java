package com.sun.online_shopping.service;

import com.sun.online_shopping.dao.IUserDao;
import com.sun.online_shopping.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zmzy on 2017/2/23.
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public User load(int id) {
        return userDao.load(id);
    }
}
