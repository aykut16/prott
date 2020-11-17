package com.javahelps.restservice.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name="ProductNames")
public class User3 {

	
	
	
	
	@Id
	private int id;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "User{" + "='" +", id='"+ id + '\'' +'}';
	}
}
