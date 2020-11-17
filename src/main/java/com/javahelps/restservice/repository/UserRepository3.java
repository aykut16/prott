package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javahelps.restservice.entity.User3;


@Repository
public interface UserRepository3 extends JpaRepository<User3,Integer> {



	

}