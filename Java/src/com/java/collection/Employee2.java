package com.java.collection;

public class Employee2 implements Comparable{
	private String name;
	private int age;
	private Mydate birthday;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
	}
	public Employee2(String name, int age, Mydate birthday) {
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee2 other = (Employee2) obj;
		if (age != other.age)
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Object o) {
		
		if(o instanceof Employee2){
			
			int i = this.getName().compareTo(((Employee2) o).getName());
			if(i == 0){
				Integer a = this.getAge();
				Integer aa = ((Employee2) o).getAge();
				return a.compareTo(aa);
			}else {
				return i;
			}
		}
		return 0;
	}
}
