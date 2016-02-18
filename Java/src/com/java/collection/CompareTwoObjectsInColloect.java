package com.java.collection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class CompareTwoObjectsInColloect {

	@Test
	public void test() {
		Collection coll = new ArrayList();
		
		coll.add(new Person("Ben",19));
		//if just want to compare the elements from the object, then must override the equals() in the Person class
		Boolean b1 = coll.contains(new Person("Ben", 19));
		System.out.println(b1);
	}

}
