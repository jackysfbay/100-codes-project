package com.java.reflection;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.lang.reflect.Method;
import org.junit.Test;

public class ReflectionTest {

	@SuppressWarnings("rawtypes")
	@Test
	public void testClass() throws ClassNotFoundException {

		Class clazz = null;
		// 1. use .class method -> get class from class name
		clazz = Person.class;
		Field[] fileds = clazz.getDeclaredFields();

		// 2. get class from object
		Person person = new Person();
		clazz = person.getClass();
		// 3. use the package name + class name - > from class full name
		clazz = Class.forName("com.java.reflection.Person");
	}

	@Test
	public void testNewInstance() throws Exception {
		// refleaction need an non-argument constructor
		Class clazz = Class.forName("com.java.reflection.Person");
		Object obj = clazz.newInstance();
		// Person person = (Person) obj;
		// person.setAge(3);
		// System.out.println(person.getAge());
	}

	@Test
	public void testClassLoader() {
		InputStream in = null;
		in = this.getClass().getClassLoader().getResourceAsStream("jdbc.properties");
		System.out.println(in);
	}

	@Test
	public void testMethod() throws Exception {
		Class clazz = Class.forName("com.java.reflection.Person");
		// get all public methods from class
		// Method[] methods = clazz.getMethods();
		// for (Method method : methods) {
		// System.out.println(method.getName());
		// }
		// get Declared (current methods we use in class ) Methods
//		Method[] methods2 = clazz.getDeclaredMethods();
//		for (Method method : methods2) {
//			System.out.println(method.getName());
//		}
		// get specified method from clss
		Method methods3 = clazz.getDeclaredMethod("setName", String.class);

		// execute method
		Object obj = clazz.newInstance();
		methods3.invoke(obj, "What");
		System.out.println(((Person) obj).getName());
	}
	@Test
	public void testGetSupperClass() throws Exception{
		String classFullName = "com.java.reflection.Student";
		Class clazz = Class.forName(classFullName);
		Class studentClass = clazz.getSuperclass();
		System.out.println(studentClass);
	}

}
