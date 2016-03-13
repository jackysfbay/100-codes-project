package com.hibernate.test;
import java.lang.Integer;

public class Customers {
	private int id;
	private String name;
	private String sex;
	private String email;
	private int salary;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Customers(int id, String name, String sex, String email, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.salary = salary;
	}
	public Customers() {
		super();
	}
	@Override
	public String toString() {
		return "Customers [id=" + id + "]";
	}
	
	
}
