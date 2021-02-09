package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class HibernateTest {

	public static void main(String[] args) {
		
	
	Employee emp = new Employee();
	emp.setId(1);
	emp.setName("Nakul");
	
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session session = sf.openSession();
	session.beginTransaction();
	session.save(emp);
	session.getTransaction().commit();
	session.close();
}
}
