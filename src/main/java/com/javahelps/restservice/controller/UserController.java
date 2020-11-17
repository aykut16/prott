package com.javahelps.restservice.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.javahelps.restservice.entity.User;

import com.javahelps.restservice.repository.UserRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/productnames")
public class UserController {



	@Autowired
	private UserRepository repository;
	
	
	@GetMapping(path = "/getall")
	public Iterable<User> findAll() {
		return repository.findAll();
	}

	@GetMapping(path = "/{id}")
	public Optional<User> find(@PathVariable("id") Integer id) {
		return repository.findById(id);
	}
	
	@GetMapping(path = "/0/0")
	public List<User> find2(Integer qty) {
		return repository.findByQty(qty=0);
	}

	@GetMapping(path = "/1/{qty}")
	public List<User> findByQthGreaterThan(@PathVariable Integer qty) {
		return repository.findByQtyGreaterThan(qty);
		
	}
	
	@GetMapping(path="barcode2/{barcode}")
	public List<User> findByBarcode(@PathVariable String barcode,@RequestParam("qty")Integer qty) {
		return repository.findByBarcodeAndQtyGreaterThan(barcode,qty);
		
	}
	

	@GetMapping(path = "/barcode/{barcode}")
	public ResponseEntity <List<User>> findd(@PathVariable("barcode") String barcode,
	                        @RequestParam Integer qty) {
		List<User> users = repository.findByBarcodeAndQty(barcode, qty);
		if (CollectionUtils.isEmpty(users)){
		    return ResponseEntity.noContent()
		        .build();
		  }
		return ResponseEntity.ok()
			      .body(users);
		}
	       
	
	
	@PostMapping(path = "/post")
	public User create(@RequestBody User user) {
		return repository.save(user);
	}

	
	
	@DeleteMapping(path = "/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repository.deleteById(id);
	}
	
	@PutMapping(path = "/{id}")
	public User update(@PathVariable("id") Integer id, @RequestBody User user) throws BadHttpRequest {
		if (repository.existsById(id)) {
			user.setId(id);
			return repository.save(user);
		} else {
			throw new BadHttpRequest();
		}
	}

	
}
