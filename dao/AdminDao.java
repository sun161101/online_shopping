package com.sun.online_shopping.dao;

import com.sun.online_shopping.mapper.AdminMapper;
import com.sun.online_shopping.model.Admin;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by 朱亦天 on 2017/2/24.
 */
@Repository
public class AdminDao implements IAdminDao {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void add(Admin admin) {

    }

    @Override
    public Admin load(int id) {
        return adminMapper.load(id);
    }
}
