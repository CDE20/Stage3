package com.jcg.hibernate.maven;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;
import org.hibernate.query.Query;



public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Country1 country=new Country1();
		//country.setCo_code(6);
		country.setCo_name("India");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		ses.beginTransaction();
		ses.save(country);
		ses.getTransaction().commit();
		//ses.getTransaction().rollback();
		ses.close();
		
		country = null;
		ses=sf.openSession();
		ses.beginTransaction();
		//country=(Country1) ses.load(Country1.class, 2);
		country=(Country1) ses.get(Country1.class, 2);
		System.out.println("Country retrieved is "+country.getCo_name());
		Country1 c=ses.get(Country1.class, 1);
		ses.delete(c);
		ses.getTransaction().commit();
		
		
		
		
    	

	}

}
