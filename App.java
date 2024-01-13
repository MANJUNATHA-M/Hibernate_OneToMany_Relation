package com.hibernate.onetomany.Hibernate_OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started" );
        
        
        Student st=new Student();
//        st.setSId(101);
//        st.setSName("Gaara");
//        st.setSGrade("Pass");
        
        Student st1=new Student();
//        st1.setSId(102);
//        st1.setSName("Sasuri");
//        st1.setSGrade("Fail");
        
        Student st2=new Student();
//        st2.setSId(103);
//        st2.setSName("Hasuma");
//        st2.setSGrade("Pass");
        
        Laptop lap=new Laptop();
//        lap.setLid(1111);
//        lap.setLName("ASUS");
//        lap.setLAmount(193849);
//        lap.setLExpireddate("1 Year");
        
        Laptop lap1=new Laptop();
//        lap1.setLid(2222);
//        lap1.setLName("Lenova");
//        lap1.setLAmount(35849);
//        lap1.setLExpireddate("1 and Half Year");
        
        Laptop lap2=new Laptop();
//        lap2.setLid(3333);
//        lap2.setLName("ThinkPad");
//        lap2.setLAmount(123849);
//        lap2.setLExpireddate("2 Year");
        
//       lap.setStudent(st);
//       lap1.setStudent(st1);
//       lap2.setStudent(st2);
        
        Configuration conf=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory fact=conf.buildSessionFactory();
        Session ses=fact.openSession();
        Transaction trans=ses.beginTransaction();
        
//        List<Object> l=new ArrayList<Object>();
//        l.add(st);
//        l.add(st1);
//        l.add(st2);
//        l.add(lap);
//        l.add(lap1);
//        l.add(lap2);
//        
//        for(Object li:l)
//        {
//        	ses.save(li);
//        	System.out.println(li);
//        }
        
         //fetch
        
        //std
        
//        st=(Student)ses.load(Student.class, 101);
//        System.out.println(st);
//        
//        st1=(Student)ses.load(Student.class, 102);
//        System.out.println(st1);
//        
//        st2=(Student)ses.load(Student.class, 103);
//        System.out.println(st2);
//        
//        //laptop
//        
//        lap=(Laptop)ses.load(Laptop.class, 1111);
//        System.out.println(lap);
//        
//        lap1=(Laptop)ses.load(Laptop.class, 2222);
//        System.out.println(lap1);
//        
//        lap2=(Laptop)ses.load(Laptop.class, 3333);
//        System.out.println(lap2);
       
        trans.commit();
        ses.close();
        
    }
}
