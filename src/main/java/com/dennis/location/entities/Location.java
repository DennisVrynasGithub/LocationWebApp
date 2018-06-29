package com.dennis.location.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

// @Entity το χρησιμοποιούμε γιατί είναι πίνακας
// Αν ο πίνακας στη βάση δεν ειχε το ίδιο όνομα τότε θα βάζαμε @Table(name="")
@Entity
public class Location {

	// @Id γιατί  είναι πρωτεύον κλειδί
	@Id
	private int id;
	private String code; // Το αφήνουμε όπως είναι
	private String name; // Αν δεν είχε το ίδιο όνομα
	private String type; // θα βάζαμε @Column(name="")
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
