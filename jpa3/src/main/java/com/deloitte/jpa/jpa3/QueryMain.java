package com.deloitte.jpa.jpa3;
import java.util.*;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class QueryMain 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA3");
        System.out.println("EntityMangerFActory created");
        
        EntityManager em=emf.createEntityManager();
        System.out.println("Entity Manager created");
        
       // Employee e= em.find(Employee.class, 101);
        
       Query q=em.createQuery("select * from Employee emp where emp.deptid=10 and emp.salary > 45000");
       List<Employee> list=q.getResultList();
       list.forEach(e-> System.out.println(e));
       
       
    }
}
