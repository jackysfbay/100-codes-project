package com.java.collection;

public class Person implements Comparable{

	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		Person other = (Person) obj;
		if (age != other.age)
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
		if(o instanceof Person){
			Person p = (Person)o; 
			//current object.property compate to p.property
//			return this.name.compareTo(p.name);
			//return -this.age.compareTo(p.age);
			int i = this.age.compareTo(p.age);
			if(i == 0){// same age, with different name
				return this.name.compareTo(p.name);
			}else{
				return i;
			}
		}
		return 0;
	}
}
