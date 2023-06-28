package com.validation.UserManagementSystem.repository;

import com.validation.UserManagementSystem.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {
    @Autowired
    private List<User> users;
    public List<User> getAllUsers() {
        return users;
    }
}
