package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.javahelps.restservice.entity.User2;

@RestResource(exported = false)
public interface UserRepository2 extends JpaRepository<User2, String> {


}
