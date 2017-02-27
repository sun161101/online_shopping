package com.sun.online_shopping.dao;

import com.sun.online_shopping.model.User;

/**
 * Created by zmzy on 2017/2/23.
 */
public interface IUserDao {
    public void add(User user);
    public User load(int id);
}
