package com.hibernate.helloword;

import static org.junit.Assert.*;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Before;
import org.junit.Test;

public class HibernateTest {

	@Before
	public void inti(){
		
	}
	
	@Test
	public void test() {
		
	//1. create session Factory object
		SessionFactory sessionFactory = null;
	//1.1 create configuration object : map with hibernate information
	Configuration configuration = new Configuration().configure();
	@SuppressWarnings("deprecation")
	ServiceRegistry serviceRegistry = 
				new ServiceRegistryBuilder().applySettings(configuration.getProperties())
											.buildServiceRegistry();
	/**
	 * 		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
	 * 												applySettings(config.getProperties())
	 * 														.buildServiceRegistry();

	 */
	
	sessionFactory =configuration.buildSessionFactory(serviceRegistry);
	//2. create session object
	Session session = sessionFactory.openSession();
	
	//3. open transation 
	Transaction transaction = session.beginTransaction();
	//4. exccute sql
	News news =new News("Java","AAAA", new Date(new java.util.Date().getTime()));
	session.save(news);
	
	News news1 = (News) session.get(News.class, 1);
	System.out.println(news1);
	//5. submit transation
	transaction.commit();
	//6. close session
	session.close();
	//7. close session factory object
	sessionFactory.close();
	}

}
