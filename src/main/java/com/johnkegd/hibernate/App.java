package com.johnkegd.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.johnkegd.hibernate.model.Course;
import com.johnkegd.hibernate.model.Teacher;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SessionFactory sessionFactory;
	Configuration config = new Configuration();
	config.configure();
	sessionFactory = config.buildSessionFactory();
	Session session = sessionFactory.openSession();
	
	//Teacher john = new Teacher("John Garcia","none");
	Course java = new Course("java","tema 1", "Rest Api");
	session.beginTransaction();
	session.save(java);
	session.getTransaction().commit();
	}

}
