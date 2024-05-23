package com.mavelhiber.ProjectWithMavel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_detail")  // Specify the table name if it's different
public class StudentDetail {

    @Id
    private int id;
    private String name;
    private String rollNo;

    // No-argument constructor
    public StudentDetail() {
        super();
    }

    // Parameterized constructor
    public StudentDetail(int id, String name, String rollNo) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    // toString method
    @Override
    public String toString() {
        return this.id + " : " + this.name + " : " + this.rollNo;
    }
}
