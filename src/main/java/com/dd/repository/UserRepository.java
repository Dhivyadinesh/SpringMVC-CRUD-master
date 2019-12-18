package com.dd.repository;

import org.springframework.data.repository.CrudRepository;

import com.dd.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
