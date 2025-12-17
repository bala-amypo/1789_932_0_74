package com.example.demo.entity;    

import jakarta.persistence.Entity;

@Entity
public class StudentEntity{
    @Id
    @GeneratedValue(stragery=GeneratedType.IDENTITY)
    private Long id;
    private string name;
    private string email;
    private float cgpa;

    public void setName(String name){
        this.name=name;
    }
    public string getName(){
        return this.name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail()
}