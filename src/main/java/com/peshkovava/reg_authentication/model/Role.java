package com.peshkovava.reg_authentication.model;
import org.springframework.security.core.GrantedAuthority;
import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String role;


    @Transient
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role() {
    }

    public Role(String role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String getAuthority() {
        return getRole();
    }

    public String getRoleNotPrefix() {
        return role.replace("ROLE_", "");
    }

}