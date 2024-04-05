package com.peshkovava.reg_authentication.service;

import com.peshkovava.reg_authentication.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User findUserById(Long id);

    void saveUser(User user);

    void delete(Long id);

    void update(Long id, User user);

    public User getUserByUsername(String username);

}

