package com.java.collection;
import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

public class TestEmployee {

	@Test
	public void test1(){
		
		Employee e1 = new Employee("Jack", 44, new Mydate(4, 3, 2011));
		Employee e2 = new Employee("Ben", 22, new Mydate(14, 9, 2012));
		Employee e3 = new Employee("Jon", 33, new Mydate(24, 10, 2006));
		Employee e4 = new Employee("Lee", 24, new Mydate(12, 10, 1986));
		Employee e5 = new Employee("Lee", 23, new Mydate(12, 10, 1986));
		
		TreeSet set = new TreeSet();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		for(Object obj: set){
			System.out.println(obj);
		}
	}
	
	@Test
	public void test2(){
		Comparator com = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Employee2 && o2 instanceof Employee2){
					Employee2 e1 = (Employee2)o1;
					Employee2 e2 = (Employee2)o2;
					
					Mydate b1 = e1.getBirthday();
					Mydate b2 = e2.getBirthday();
					
					if(b1.getYear() != b2.getYear()){
						return b1.getYear()-b2.getYear();
					}else{
						if(b1.getMonth() != b2.getMonth()){
							return b1.getMonth() - b2.getMonth();
						}else{
							return b1.getDay() - b2.getDay();
						}
					}
				}
				return 0;
			}
			
		};
		Employee2 e1 = new Employee2("Jack", 44, new Mydate(4, 3, 2011));
		Employee2 e2 = new Employee2("Ben", 22, new Mydate(14, 9, 2012));
		Employee2 e3 = new Employee2("Jon", 33, new Mydate(24, 10, 2006));
		Employee2 e4 = new Employee2("Lee", 24, new Mydate(12, 10, 1986));
		Employee2 e5 = new Employee2("Lee", 23, new Mydate(14, 10, 1986));
		
		TreeSet set = new TreeSet();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		for(Object obj: set){
			System.out.println(obj);
		}
	}
}
