package com.javahelps.restservice.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.Proxy;


@Entity
@Table(name="product_names")
@Proxy(lazy = false)
public class User {

	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",unique = true, length = 128)
	private int id;
	private String barcode;
	private String name;
	private String bname;
	private String category;
	private int qty;
	private Date dater;
	private Date datel;
	private double cost;
	
	
	public User(String barcode,String name,String bname,String category,int qty,Date dater,Date datel,double cost) 
	{
		super();
		this.barcode=barcode;
		this.name=name;
		this.bname=bname;
		this.category=category;
		this.qty=qty;
		this.dater=dater;
		this.datel=datel;
		this.cost=cost;
		
	}
	
	
	
	
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

