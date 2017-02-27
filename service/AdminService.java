package com.sun.online_shopping.service;

import com.sun.online_shopping.dao.IAdminDao;
import com.sun.online_shopping.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 朱亦天 on 2017/2/24.
 */
@Service
public class AdminService implements IAdminService {
    @Autowired
    private IAdminDao adminDao;

    @Override
    public void add(Admin admin) {

    }

    @Override
    public Admin load(int id) {
        return adminDao.load(id);
    }
}
