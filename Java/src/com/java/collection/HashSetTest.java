package com.java.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;

public class HashSetTest {

	@Test
	public void test() {

		Set set = new HashSet();

		set.add("asdsa");
		set.add(3);
		set.add(6);
		set.add("A");

		System.out.println(set);
		for (Object object : set) {

			System.out.println(object.hashCode());
		}
		System.out.println('A');
		String a = new String("a");

		System.out.println("a" == a);

	}

	@Test
	public void test2() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ele1", "小樱");
		map.put("ele2", "若曦");
		map.put("ele3", "晴川");
		Set<String> set = map.keySet();
		Set set1 = map.entrySet();
		System.out.println(set1);

	}

	@Test
	public void treeSet() {// natural sorting
		// TreeSet must have the some date type
		// TreeSet will make a sorting
		// If compare some objects, it must implements compareable inteface
		// method
		Set set = new TreeSet();
		set.add(new Person("Jacky", 2));
		set.add(new Person("Ben", 23));
		set.add(new Person("Ren", 243));
		set.add(new Person("Yen", 233));
		set.add(new Person("Aen", 233));
		// set.add("G");
		// set.add("c");
		// set.add("A");
		// set.add("G");
		// set.add("M");

		for (Object obj : set) {
			System.out.println(((Person) obj).getName() + " " + ((Person) obj).getAge());
		}
	}

	@Test
	public void treeSet2() {
		// Custom sorting
		// 1. create comparater object
		Comparator com = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Customer && o2 instanceof Customer) {
					Customer c1 = (Customer) o1;
					Customer c2 = (Customer) o2;
					int x = c1.getId().compareTo(c2.getId());
					// System.out.println("=="+x);
					if (x == 0) {
						return c1.getName().compareTo(c2.getName());
					} else {
						return x;
					}
				}
				return 0;
			}
		};

		Set set = new TreeSet(com);
		set.add(new Customer("D", "sdasd"));
		set.add(new Customer("A", "sdfasd"));
		set.add(new Customer("C", "sdasdfsd"));
		set.add(new Customer("F", "sdsdfasd"));
		set.add(new Customer("B", "sdsdfasd"));
		set.add(new Customer("B", "324324"));

		for (Object obj : set) {
			Customer c = (Customer) obj;
			System.out.println(c.getId() + " " + c.getName());
		}
	}
	
	@Test
	public void treeSet3() {
		
	}
}
