package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="sports_AD")
public class sports {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sports_id")
	private int Sports;
	
	@Column(name="sports_name")
	private String Sports_name;
	
	@Column(name="sports_description")
	private String Sports_description;
	
	@Column(name="sports_price")
	private int price;
	
	@Column(name="sports_image")
	private String Sports_image;
	
	@Column(name="sports_brand")
	private String Sports_brand;
	
	@Column(name="Location")
	private String Location;
	
	@Column(name="active")
	private int active;
	
	@Column(name="sportscategory_id")
	private int category_id;
	
	@ManyToOne(targetEntity = Category.class,fetch = FetchType.EAGER)
	@JoinColumn(name="sportscategory_id",insertable = false, updatable = false )
	private Category sports_category;
	public sports() {
		
	}


	public sports(int sports, String sports_name, String sports_description, int price, String sports_image,
			String sports_brand, String Location, int active, int category_id, Category sports_category) {
		super();
		this.Sports = sports;
	    this.Sports_name = sports_name;
	    this.Sports_description = sports_description;
		this.price = price;
		this.Sports_image = sports_image;
		this.Sports_brand = sports_brand;
		this.Location = Location;
		this.active = active;
		this.category_id = category_id;
		this.sports_category = sports_category;
	}


	public int getSports() {
		return Sports;
	}


	public void setSports(int sports) {
		Sports = sports;
	}


	public String getSports_name() {
		return Sports_name;
	}


	public void setSports_name(String sports_name) {
		Sports_name = sports_name;
	}


	public String getSports_description() {
		return Sports_description;
	}


	public void setSports_description(String sports_description) {
		Sports_description = sports_description;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getSports_image() {
		return Sports_image;
	}


	public void setSports_image(String sports_image) {
		Sports_image = sports_image;
	}


	public String getSports_brand() {
		return Sports_brand;
	}


	public void setSports_brand(String sports_brand) {
		Sports_brand = sports_brand;
	}


	public String getLocation() {
		return Location;
	}


	public void setSports_quantity(String Location) {
		Location = Location;
	}


	public int getActive() {
		return active;
	}


	public void setActive(int active) {
		this.active = active;
	}


	public int getCategory_id() {
		return category_id;
	}


	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}


	public Category getSports_category() {
		return sports_category;
	}


	public void setSports_category(Category sports_category) {
		this.sports_category = sports_category;
	}


}

	