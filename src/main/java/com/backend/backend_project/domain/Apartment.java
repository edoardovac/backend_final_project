package com.backend.backend_project.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Apartment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String owner;
	private int aptNumber;
	private String stair;

	public Apartment(String owner, int aptNumber, String stair) {
		this.owner = owner;
		this.aptNumber = aptNumber;
		this.stair = stair;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getAptNumber() {
		return aptNumber;
	}

	public void setAptNumber(int aptNumber) {
		this.aptNumber = aptNumber;
	}

	public String getStair() {
		return stair;
	}

	public void setStair(String stair) {
		this.stair = stair;
	}

}
