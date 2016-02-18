package com.java.collection;
/**
 *   MAP
 *    |---HasgMap
 *    |---LinkedMap 
 *    |---HashTable
 */	 

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TestMap {

	@Test
	public void HashMap() {
		
		Map map = new HashMap();
		map.put("a", 123);
		map.put("n", 33);
		map.put("n", 332);
		map.put("v", 3);
		map.put("f", 23);
		map.put(null, null);
		System.out.println(map.size());
		
		Set set = map.keySet(); // get key   
		for (Object obj : set) {
			System.out.println(obj +":"+ map.get(obj));
		}
		Collection coll =  map.values(); // get value
		Set ky=  map.entrySet(); // get key - value // getKey() ,,, getValue()
	}
	
	@Test
	public void LinkedHashMap() {
		// same with the LinkedHashSet
		Map map = new HashMap();
		map.put("a", 123);
		map.put("n", 33);
		map.put("n", 332);
		map.put("v", 3);
		map.put("f", 23);
		map.put(null, null);
		
		
	}

}
