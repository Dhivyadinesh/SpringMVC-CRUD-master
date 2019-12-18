package com.dd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import com.dd.entity.Todo;

@Component
@RepositoryRestResource
public interface TodoDAO extends JpaRepository<Todo, Integer>{
//	@Query("From Todo order by name desc")
//	List<Todo> findAllOrderByName();
}
