package com.javahelps.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.javahelps.restservice.entity.User3;
import com.javahelps.restservice.repository.UserRepository3;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/delete")
public class UserController3 {

	@Autowired
	private UserRepository3 repository;


	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repository.delete(id);
	}

	@PutMapping(path = "/{id}")
	public User3 update(@PathVariable("id") Integer id, @RequestBody User3 user) throws BadHttpRequest {
		if (repository.exists(id)) {
			user.setId(id);
			return repository.save(user);
		} else {
			throw new BadHttpRequest();
		}
	}

	
}
