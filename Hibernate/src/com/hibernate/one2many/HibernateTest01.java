package com.hibernate.one2many;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HibernateTest01 {

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
	public void testget() {
		Order order = (Order) session.get(Order.class, 1);
		Customer customer = order.getCustomer();
		System.out.println(customer.getCustomerName());
	}

	@Test
	public void testSave() {
		Customer customer = new Customer();
		customer.setCustomerName("AA");

		Order order1 = new Order();
		order1.setOrderName("Order-1");

		Order order2 = new Order();
		order2.setOrderName("Order-2");

		order1.setCustomer(customer);
		order2.setCustomer(customer);
		session.save(customer);
		session.save(order1);
		session.save(order2);
	}

}
