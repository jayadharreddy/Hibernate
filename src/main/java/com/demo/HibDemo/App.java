package com.demo.HibDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Employee emp=new Employee();
        emp.setId(5);
        emp.setName("John");
        emp.setSkill("MySql");
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        session.save(emp);
        tx.commit();
    }
}
