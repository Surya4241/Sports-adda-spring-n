package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="orderlist")
public class Orderlist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="orderid")
	private int orderid;
	
	@Column(name="sports_name")
	private String sports_name;
	
	@Column(name="quantity")
	private String quantity;
	
	@Column(name="price")
	private String price;
	
	@Column(name="userid")
	private String userid;

	public Orderlist() {
		
	}

	public Orderlist(int orderid, String product_name, String quantity, String price, String userid) {
		super();
		this.orderid = orderid;
		this.sports_name = product_name;
		this.quantity = quantity;
		this.price = price;
		this.userid = userid;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getSports_name() {
		return sports_name;
	}

	public void setSports_name(String sports_name) {
		this.sports_name = sports_name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	
	
	
	
}
