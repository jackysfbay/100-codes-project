package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicateStringFromList {

	public static void method1(ArrayList arr) {

		HashSet h = new HashSet(arr);
		arr.clear();
		arr.addAll(h);
		System.out.println(arr);
	}

	public static void method2(ArrayList arr) {

		HashSet set = new HashSet(arr);
		List newList = new ArrayList();
		for(Iterator iter = arr.iterator(); iter.hasNext();){
			Object element = iter.next();
			if(set.add(element)){
				newList.add(element);
			}
			arr.clear();
			arr.addAll(newList);
		}
		System.out.println(arr);
	}
	
	public static void main(String[] args) {
	}
}
