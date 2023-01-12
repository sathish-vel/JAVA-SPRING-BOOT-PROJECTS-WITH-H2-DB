package com.SpringProject.FirstProject1.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class User1 {			// http://localhost:1234/h2-console/ (H2 database Console)
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User1 id :" + id + ", name : " + name + ", email : " + email + "";
	}
	

}
