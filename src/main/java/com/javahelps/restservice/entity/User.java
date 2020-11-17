package com.javahelps.restservice.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;


@Entity

@Table(name="ProductNames")
@Proxy(lazy=false)
public class User {

	
	
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="barcode")
	private String barcode;
	@Column(name="name")
	private String name;
	@Column(name="bname")
	private String bname;
	@Column(name="category")
	private String category;
	@Column(name="qty")
	private int qty;
	@Column(name="dater")
	private Date dater;
	@Column(name="datel")
	private Date datel;
	@Column(name="cost")
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

