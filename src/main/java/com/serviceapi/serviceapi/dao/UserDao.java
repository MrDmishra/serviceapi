package com.serviceapi.serviceapi.dao;

import com.serviceapi.serviceapi.entity.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String>{
    
}
