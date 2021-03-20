package com.johnkegd.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class JohnkegdSession {
	
	public Session getSession() {
		SessionFactory sf;
		Configuration config = new Configuration();
		config.configure();
		sf = config.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}

}
