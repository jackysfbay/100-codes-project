package com.hibernate.helloword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hibernate.component.Pay;
import com.hibernate.component.Worker;

@SuppressWarnings("deprecation")
public class HibernateTest2 {
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
	// before transaction , it will call flush().
	// flush() may send sql script to db for comparing the object in cache and
	// db
	public void testSessionFlush() {
		News news1 = (News) session.get(News.class, 1);
		news1.setAuthor("XdML");
	}

	@Test
	public void testRefresh() {
		News news1 = (News) session.get(News.class, 1);
		System.out.println(news1);
		// 1. change the tile from java to php where id = 1; then use session
		// refresh
		session.refresh(news1);
		System.out.println(news1);

	}

	@Test
	public void test1() {
		News news1 = (News) session.get(News.class, 1);
		News news2 = (News) session.get(News.class, 1);
		System.out.println(news1);
		System.out.println(news2);
	}

	/**
	 * Get vs Load 1. session.load() It will always return a “proxy” (Hibernate
	 * term) without hitting the database. In Hibernate, proxy is an object with
	 * the given identifier value, its properties are not initialized yet, it
	 * just look like a temporary fake object. If no row found , it will throws
	 * an ObjectNotFoundException. 2. session.get() It always hit the database
	 * and return the real object, an object that represent the database row,
	 * not proxy. If no row found , it return null.
	 * 
	 */

	@Test
	public void testGet() {
		// Get will return null if the object OID is not found
		News news1 = (News) session.get(News.class, 7);
		System.out.println(news1);
		/**
		 * In session.get(), Hibernate will hit the database to retrieve the
		 * Stock object and put it as a reference to StockTransaction. However,
		 * this save process is extremely high demand, there may be thousand or
		 * million transactions per hour, do you think is this necessary to hit
		 * the database to retrieve the Stock object everything save a stock
		 * transaction record? After all you just need the Stock’s Id as a
		 * reference to StockTransaction.
		 */

	}

	@Test
	public void testload() {
		// lazyInitailzationException
		// load throw a excetion "objectNotFound" if the object OID is not found
		News news1 = (News) session.load(News.class, 7);
		System.out.println(news1);
		/**
		 * In session.load(), Hibernate will not hit the database (no select
		 * statement in output) to retrieve the Stock object, it will return a
		 * Stock proxy object – a fake object with given identify value. In this
		 * scenario, a proxy object is enough for to save a stock transaction
		 * record.
		 */

	}

	@Test
	public void testPersist() {
		News news = new News();
		news.setAuthor("ddsssertsA");
		news.setTitle("TTSertSS");

		session.save(news);
	}

	@Test
	public void test02() {
		News news = (News) session.get(News.class, 2);
		news.setAuthor("AAdqqA");
	}
	@Test
	public void TestBlob() throws IOException {
		News news12 = new News();
		news12.setAuthor("AAAA");
		news12.setTitle("AA-Title");
		news12.setDate(new java.sql.Date(new Date().getTime()));;
		
		InputStream stream = new FileInputStream("transcripts.png");
		Blob image = Hibernate.getLobCreator(session).createBlob(stream, stream.available());
		news12.setImage(image);

		session.save(news12);
		
		/**
		 * News news = (News) session.get(News.class, 1);
		Blob image = news.getImage();
		
		InputStream in = image.getBinaryStream();
		System.out.println(in.available()); 
		 * 
		 */
	}
	@Test
	public void test() {
		Worker worker = new Worker();
		Pay pay = new Pay();

		pay.setMonthlyPay(1000);
		pay.setYearPay(80000);
		pay.setVocationWithPay(5);

		worker.setName("ABCD");
		worker.setPay(pay);

		session.save(worker);

	}
}
