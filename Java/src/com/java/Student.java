package com.java;

public class Student {
	private String id;
	private String name;
	private String sex;
	private String age;
	
	Student(String Name, String Sex, String Age) {
        this.id = null; //default
        this.name = Name;
        this.sex = Sex;
        this.age = Age;
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
}
