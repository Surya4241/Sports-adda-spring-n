package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="coach")
public class coach {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="coach_id")
	private int coach_id;
	
	@Column(name="coach_name")
	private String coach_name;


	public coach() {
		
	}

	public coach(int coach_id, String coach_name) {
		super();
		this.coach_id = coach_id;
		this.coach_name = coach_name;
	}

	public int getcoach_id() {
		return coach_id;
	}

	public void setcoach_id(int coach_id) {
		this.coach_id = coach_id;
	}

	public String getcoach_name() {
		return coach_name;
	}

	public void set_name(String coach_name) {
		this.coach_name = coach_name;
	}
	
	

}
