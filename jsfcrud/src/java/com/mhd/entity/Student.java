
package com.mhd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stud")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    private String round;
    
    private String gender;
    
    @Column(name = "courseCompleted")
    private String completedCourse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompletedCourse() {
        return completedCourse;
    }

    public void setCompletedCourse(String completedCourse) {
        this.completedCourse = completedCourse;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", round=" + round + ", gender=" + gender + ", completedCourse=" + completedCourse + '}';
    }
    
    
}
