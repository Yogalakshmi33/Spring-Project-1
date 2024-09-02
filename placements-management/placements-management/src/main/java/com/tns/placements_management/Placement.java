package com.tns.placements_management;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Aspring")
public class Placement
{
	@Id
	@Column(name="Cid")
	private int id;
	@Column(name="Cname")
	private String name;
	@Column(name="course")
	private String course;
	@Column(name="email")
	private String email;
	
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Placement(int id, String name, String course, String email) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
	}
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", course=" + course + ", email=" + email + "]";
	}
	
	
	
	
	
}