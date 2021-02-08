package com.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.ProductDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		
		ProductDetails pd = new ProductDetails();
		pd.setProductId(1);
		pd.setProductName("Product Name 1");
		pd.setShippingDate(new Date());
		Address address = new Address();
		address.setCity("Manmad");
		address.setStreet("Mahananda Nagar");
		address.setPincode("423104");
		address.setState("Maharashtra");
		pd.setAddress(address);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(pd);
		session.getTransaction().commit();
		session.close();
		
	}

}
