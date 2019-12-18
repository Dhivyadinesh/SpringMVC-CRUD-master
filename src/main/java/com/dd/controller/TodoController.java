package com.dd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.dd.dao.TodoDAO;
import com.dd.entity.Todo;

@Controller
public class TodoController {

	@Autowired
	TodoDAO fdao;

	@RequestMapping("/todo")
	public ModelAndView Alltodo() {
		ModelAndView mv = new ModelAndView("todo.html");
		mv.addObject("todos", fdao.findAll());
		return mv;
	}

	@RequestMapping("/todo/add")
	public String addForm() {
		return "add.html";
	}
	
	@RequestMapping("/todo/addtodo")
	public RedirectView addtodo(@ModelAttribute("todo") Todo todo) {
		fdao.save(todo);
		System.out.println("added todo : " + todo);
		return new RedirectView("/todo");
	}
	
	
	@RequestMapping("/todo/edit")
	public ModelAndView edittodo() {
		ModelAndView mv = new ModelAndView("update.html");
		mv.addObject("todos",fdao.findAll());
		return mv;
	}

	@RequestMapping("/todo/edit/{id}")
	public ModelAndView updatetodoById(@PathVariable(name = "id") Integer idtodo) {
		ModelAndView mv = new ModelAndView("edit.html");
		mv.addObject("todo", fdao.findById(idtodo));
		System.out.println(fdao.findById(idtodo));
		return mv;
	}

	@RequestMapping("/todo/edit/edittodo")
	public RedirectView updatetodo(@ModelAttribute("todo") Todo todo) {
		fdao.save(todo);
		System.out.println("updateded todo : " + todo);
		return new RedirectView("/todo");
	}

	@RequestMapping("/todo/delete/{id}")
	public RedirectView deletetodo(@PathVariable(name = "id") Integer idtodo) {
		fdao.deleteById(idtodo);
		return new RedirectView("/todo");
	}

}
