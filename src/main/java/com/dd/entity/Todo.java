package com.dd.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idtodo;
	private String subject;
	private String message;
	
	public Todo( String subject, String message) {
		super();
		this.subject = subject;
		this.message = message;
	}
	   
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
    private User user;    

	public Todo() {
	}
	
	@Override
	public String toString() {
		return "Todo [idtodo=" + idtodo + ", subject=" + subject+ ", message=" + message + "]";
	}

	public Integer getIdtodo() {
		return idtodo;
	}

	public void setIdtodo(Integer idtodo) {
		this.idtodo = idtodo;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
