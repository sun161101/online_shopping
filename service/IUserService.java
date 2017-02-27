package com.sun.online_shopping.service;

import com.sun.online_shopping.model.User;

/**
 * Created by zmzy on 2017/2/23.
 */
public interface IUserService {
    public void add(User user);
    public User load(int id);
}
