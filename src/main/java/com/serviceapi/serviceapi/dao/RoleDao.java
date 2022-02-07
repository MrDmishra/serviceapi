package com.serviceapi.serviceapi.dao;

import com.serviceapi.serviceapi.entity.Role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String>{
    
}
