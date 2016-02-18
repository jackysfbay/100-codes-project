package com.java.collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.script.Compilable;

import org.junit.Test;


public class CollectionsTools {

	@Test
	public void test1() {
		List list = new ArrayList();
		list.add(123);
		list.add(123);
		list.add(123);
		list.add(456);
		
		Collections.reverse(list); // reverse list 
		Collections.shuffle(list);//ramdon sort
		Collections.sort(list);
//		Collections.sort(list, Comparartor);
		Collections.max(list);
		Collections.frequency(list, 123); // element frequency in list , return how many times 
		List list2 = Arrays.asList(new Object[list.size()]);
		Collections.copy(list2, list);
		List list3 = Collections.synchronizedList(list); // use for Thread
	}
	@Test
	public void test2() {
		
	}
	@Test
	public void test3() {
		
	}
	@Test
	public void test4() {
		
	}

}
