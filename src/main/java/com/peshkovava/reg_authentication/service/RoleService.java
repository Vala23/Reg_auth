package com.peshkovava.reg_authentication.service;

import com.peshkovava.reg_authentication.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> getAllRole();

    void saveRole(Role role);
}

