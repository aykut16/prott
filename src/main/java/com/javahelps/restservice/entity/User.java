package com.javahelps.restservice.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name="ProductNames")
public class User {

	
	
	
	@Id
	private int id;
	
	
	private String barcode;
	private String name;
	private String bname;
	private String category;
	private int qty;
	private Date dater;
	private Date datel;
	private double cost;
	
	public double getCost() {
		return cost;
	}
	
	
	public void setCost(double cost) {
		this.cost=cost;
		
	}
	
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

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Date getDater() {
		return dater;
	}

	public void setDater(Date dater) {
		this.dater = dater;
		
	}

	public Date getDatel() {
		return datel;
	}

	public void setDatel(Date datel) {
		this.datel = datel;
		
	}
	
	
	@Override
	public String toString() {
		return "User{" + "='" +", id='"+ id + '\'' +", name='"+ barcode + '\'' + ", name='" + name + '\'' + "bname='\" + bname + '\\'' + \"cost='\\\" + cost + '\\\\'' +category='" + category + '\''
				+ ", qty='" + qty + '\'' + ", dater='" + dater + '\''+", datel='" + datel + '\''+'}';
	}


	}
