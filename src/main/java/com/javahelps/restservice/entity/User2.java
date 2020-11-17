package com.javahelps.restservice.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name="Products")
public class User2 {

	private int id;
	@Id
	private String barcode;
	private String name;
	private String category;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
	@Override
	public String toString() {
		return "User{" + "='" +", id='"+ id + '\'' +", name='"+ barcode + '\'' + ", name='" + name + '\'' + ", category='" + category + '\''	+'}';
	}
}
