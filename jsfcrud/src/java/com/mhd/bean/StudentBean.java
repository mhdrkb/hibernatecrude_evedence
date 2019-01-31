package com.mhd.bean;

import com.mhd.entity.Student;
import com.mhd.service.StudentService;
import java.util.ArrayList;
import java.util.List;

public class StudentBean {

    private StudentService service = new StudentService();
    private Student student;
    private List<Student> list;
    private String[] cmplCours;

    public void save() {
        String cc = "";
        for (String s : cmplCours) {
            cc += s + ", ";
        }
        student.setCompletedCourse(cc);
        service.saveOrUpdate(student);
    }

    public void del() {
        service.delete(student);
    }

    public void edit() {
        service.saveOrUpdate(student);
    }

//    public void searchById() {
//        Student s = new Student();
//        s = service.getStudentById(student.getId());
//        return s;
//    }

    public StudentService getService() {
        return service;
    }

    public void setService(StudentService service) {
        this.service = service;
    }

    public Student getStudent() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getList() {
        list = new ArrayList<>();
        list = service.getStudentList();
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public String[] getCmplCours() {
        return cmplCours;
    }

    public void setCmplCours(String[] cmplCours) {
        this.cmplCours = cmplCours;
    }

}
