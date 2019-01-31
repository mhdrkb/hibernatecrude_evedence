package com.mhd.service;

import com.mhd.entity.Student;
import com.mhd.utils.HibernateUtils;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentService {

    public static void saveOrUpdate(Student student) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.saveOrUpdate(student);
        System.out.println("Data saved successfully");
        tr.commit();
    }

    public static void delete(Student student) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.delete(student);
        System.out.println("Deleted Successfully");
        tr.commit();
    }

    public static Student getStudentById(int id) {
        Student student = new Student();
        try {
            SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            Transaction tr = session.beginTransaction();
            student = (Student) session.get(Student.class, id);
            tr.commit();
        } catch (Exception e) {
            System.out.println("Something Wrong");
        }
        return student;
    }
    public static List<Student> getStudentList(){
        List<Student> studentList = new ArrayList<>();
        try{
            SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            Transaction tr = session.beginTransaction();
            studentList = session.createQuery("From Student").list();
            tr.commit();
        }catch(Exception e){
            System.out.println("Something Wrong");
        }
        return studentList;
    }
}
