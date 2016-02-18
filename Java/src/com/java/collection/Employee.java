package com.java.collection;

public class Employee {
	private String name;
	private int age;
	private Mydate birthday;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
	}
	public Employee(String name, int age, Mydate birthday) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Mydate getBirthday() {
		return birthday;
	}
	public void setBirthday(Mydate birthday) {
		this.birthday = birthday;
	}
}
