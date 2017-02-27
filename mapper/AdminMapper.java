package com.sun.online_shopping.mapper;

import com.sun.online_shopping.model.Admin;
import com.sun.online_shopping.model.User;

/**
 * Created by zmzy on 2017/2/23.
 */
public interface AdminMapper {
    public void add(Admin admin);
    public Admin load(int id);
}
