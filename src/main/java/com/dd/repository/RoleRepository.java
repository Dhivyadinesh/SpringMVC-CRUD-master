package com.dd.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dd.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

    List<Role> findAll();
    Role findByRolename(String name);
}
