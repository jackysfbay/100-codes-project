package com.hibernate.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HibernateTest {
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	@Before
	public void inti() {
		// return hibernate.cfg.xml
		Configuration configuration = new Configuration().configure();
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(registry);
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
	}

	@After
	public void destroy() {
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void testData() {
		RandomString randomString = new RandomString();
		for (int i = 0; i < 100; i++) {
			String str = randomString.randomStr();
			Customers customers = new Customers();
			customers.setEmail(str + "@gmail.com");
			customers.setName(str.toUpperCase());
			customers.setSex(str.toUpperCase());
			customers.setSalary(randomString.salaryRandom());
			session.save(customers);
		}
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testHQL() {
		String sql = "FROM Customers   WHERE SALARY > :sal AND name LIKE :name";

		org.hibernate.Query query = session.createQuery(sql);

		query.setInteger("sal", 100).setString("name", "%A%");

		List<Customers> Customers = query.list();

		System.out.println(Customers.size());
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testPageHQL() {
		String sql = "FROM Customers ";

		org.hibernate.Query query = session.createQuery(sql);

		int pageNo = 20;
		int pageSize = 5;
		List<Customers> Customers = query.setFirstResult((pageNo - 1) * pageSize).setMaxResults(pageSize).list();

		System.out.println(Customers);

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testNameHQL() {

		org.hibernate.Query query = session.getNamedQuery("salaryCustomer");

		List<Customers> Customers = query.setInteger("minSal", 400).setInteger("maxSal", 1000).list();

		System.out.println(Customers.size());
	}
	@Test
	public void testFieldHQL() {
		String hql ="select SALARY, name from  Customers";
		org.hibernate.Query query = session.createQuery(hql);
		
		List<Object[]> Customers = query.list();
	
		
	}
}
