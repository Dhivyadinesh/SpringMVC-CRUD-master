package com.dd;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dd.dao.TodoDAO;
import com.dd.entity.Todo;

@SpringBootApplication
public class SpringmvcDemoApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(SpringmvcDemoApplication.class, args);
		TodoDAO fdao = ac.getBean(TodoDAO.class);
		List<Todo> f = fdao.findAll();
		for (Todo todo : f) {
			System.out.println(todo);
		}
	}



}
