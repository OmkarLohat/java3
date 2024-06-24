package com.deloitte.jpa.jpa3;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA3");
        System.out.println("EntityMangerFActory created");
        
        EntityManager em=emf.createEntityManager();
        System.out.println("Entity Manager created");
        
       // Employee e= em.find(Employee.class, 101);
        
        Employee e=new Employee(999,"Abcd",45000,10,LocalDate.of(1988, 12, 23));
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        System.out.println(e);
        
        em.close();
        emf.close();
        
    }
}
