package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    private int id;
    private String ename;
    private String designation;
    private String company;

    public User() {
    }

    public User(int id, String ename, String designation, String company) {
        this.id = id;
        this.ename = ename;
        this.designation = designation;
        this.company = company;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
