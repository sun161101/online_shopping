package com.sun.online_shopping.dao;


import com.sun.online_shopping.model.Admin;

/**
 * Created by 朱亦天 on 2017/2/24.
 */
public interface IAdminDao {
    public void add(Admin admin);
    public Admin load(int id);
}
