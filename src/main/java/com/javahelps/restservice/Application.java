package com.javahelps.restservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.javahelps.restservice.entity.User;

import com.javahelps.restservice.repository.UserRepository;

import com.javahelps.restservice.repository.UserRepository2;

import com.javahelps.restservice.repository.UserRepository3;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	protected CommandLineRunner init(final UserRepository userRepository , UserRepository2 userRepository2,UserRepository3 userRepository3) {
		return null;

		

		};
	}

