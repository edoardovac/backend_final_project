package com.backend.backend_project.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Building {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String address;
	private int stairNumber;

	public Building(String address, int stairNumber) {
		this.address = address;
		this.stairNumber = stairNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getStairNumber() {
		return stairNumber;
	}

	public void setStairNumber(int stairNumber) {
		this.stairNumber = stairNumber;
	}

}
