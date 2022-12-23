package com.restapi.assign.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="employee")
public class Employee {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

private String name;
private String address;
private int pincode;
private String state;



public void setName(String name) {
	this.name=name;
}

public String getName() {
	return this.name;
}

public void setAddress(String address) {
	this.address=address;
}

public String getAddress() {
	return this.address;
}

public void setPincode(int pincode) {
	this.pincode=pincode;
}

public int getPincode() {
	return this.pincode;
}

public void setState(String state) {
	this.state=state;
}
public String getState() {
	return this.state;
}

@Temporal(TemporalType.TIMESTAMP)
@Column(nullable=false)
private Date creation_timestamp;

@PrePersist
private void onCreate() {
	creation_timestamp = new Date();
}

public void setId(int id) {
	this.id = id;
}

public int getId() {
	return this.id;
}

public Date getCreation_TimeStamp() {
	return this.creation_timestamp;
}
}








