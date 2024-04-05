package com.peshkovava.reg_authentication.repositories;

import com.peshkovava.reg_authentication.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
