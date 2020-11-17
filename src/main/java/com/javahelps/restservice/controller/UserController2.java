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

import com.javahelps.restservice.entity.User;
import com.javahelps.restservice.entity.User2;
import com.javahelps.restservice.repository.UserRepository2;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/product")
public class UserController2 {

	@Autowired
	private UserRepository2 repository;

	@GetMapping
	public List<User2> findAll() {
		return repository.findAll();
	}

	@GetMapping(path = "/{barcode}")
	public User2 find(@PathVariable("barcode") String barcode) {
		return repository.findOne(barcode);
	}

	@PostMapping(consumes = "application/json")
	public User2 create(@RequestBody User2 user) {
		return repository.save(user);
	}

	@DeleteMapping(path = "/{barcode}")
	public void delete(@PathVariable("barcode") String barcode) {
		repository.delete(barcode);
	}

	@PutMapping(path = "/{barcode}")
	public User2 update(@PathVariable("barcode") String barcode, @RequestBody User2 user) throws BadHttpRequest {
		if (repository.exists(barcode)) {
			user.setBarcode(barcode);
			return repository.save(user);
		} else {
			throw new BadHttpRequest();
		}
	}

	
}
