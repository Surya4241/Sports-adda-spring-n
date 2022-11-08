package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="booking")
public class booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="booking_id")
	private int booking_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="image")
	private String image;
	
	@Column(name="Location")
	private String Location;
	
	@Column(name="price")
	private int price;
	
	@Column(name="user_id")
	private int user_id;
	
	
	/*@OneToMany(mappedBy="cart")
	public Set<User> user;*/
	
	public booking() {
		
	}

	public booking(String name, String image, String Location, int price,int booking_id,int user_id) {
		super();
		this.name = name;
		this.image = image;
		this.Location = Location;
		this.price = price;
		this.booking_id=booking_id;
		this.user_id=user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getimage() {
		return image;
	}

	public void setimage(String image) {
		this.image = image;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String Location) {
		this.Location = Location;
	}

	public int getprice() {
		return price;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public int getOrder_id() {
		return booking_id;
	}

	public void setOrder_id(int order_id) {
		this.booking_id = booking_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
	
	

}
