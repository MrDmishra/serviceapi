package com.serviceapi.serviceapi.service;

import com.serviceapi.serviceapi.dao.RoleDao;
import com.serviceapi.serviceapi.entity.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;
    
    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
