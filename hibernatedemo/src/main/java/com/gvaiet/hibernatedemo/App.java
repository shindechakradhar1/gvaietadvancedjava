package com.gvaiet.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ){
        Configuration config = new Configuration();
//        config.configure("config.cfg.xml");
        config.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/gvaiet_db");
        config.setProperty("hibernate.connection.username", "root");
        config.setProperty("hibernate.connection.password", "root");
        config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        config.setProperty("hibernate.hbm2ddl", "update");
        config.setProperty("hibernate.show_sql", "true");
        
        config.addAnnotatedClass(Book.class);
        config.addAnnotatedClass(Author.class);
        
        
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        
        transaction.begin();
        session.save(new Book(2,"Java",120.12F));
        session.save(new Author(2,"ABC",32));
        transaction.commit();

        session.close();
        
    }
}
