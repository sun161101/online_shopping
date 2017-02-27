package com.sun.online_shopping.mapper;

import com.sun.online_shopping.model.User;

/**
 * Created by zmzy on 2017/2/23.
 */
public interface CommodityMapper {
    public void add(User user);
    public User load(int id);
}
