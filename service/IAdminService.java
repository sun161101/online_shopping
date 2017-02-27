package com.sun.online_shopping.service;

import com.sun.online_shopping.model.Admin;

/**
 * Created by 朱亦天 on 2017/2/24.
 */
public interface IAdminService {
    void add(Admin admin);
    Admin load(int id);
}
