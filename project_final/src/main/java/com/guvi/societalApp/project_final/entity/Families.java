package com.guvi.societalApp.project_final.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "family")
public class Families {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "owner")
	private String owner;
	@Column(name = "email")
	private String email;
	@Column(name = "building")
	private String building;
	@Column(name = "owned")
	private String owned;

	// define Constructors
	public Families() {

	}

	public Families(String owner, String email, String building, String owned) {
		super();
		this.owner = owner;
		this.email = email;
		this.building = building;
		this.email = email;
		this.owned = owned;
	}

	// Define getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getOwned() {
		return owned;
	}

	public void setOwned(String owned) {
		this.owned = owned;
	}

	// Define toString

	@Override
	public String toString() {
		return "Family [id=" + id + ", owner=" + owner + ", email=" + email + ", building=" + building + ", owned=" + owned + "]";
	}
}
