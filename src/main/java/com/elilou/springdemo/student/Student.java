package com.elilou.springdemo.student;

import java.time.LocalDate;

public class Student {

    private String fisrtname;

    private String lastname;

    private LocalDate dateOfBirth;

    private String email;

    private int age;


    public Student(String fisrtname,
                   String lastname,
                   LocalDate dateOfBirth,
                   String email,
                   int age)
    {
        this.fisrtname = fisrtname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.age = age;
    }








    public String getFisrtname() {
        return fisrtname;
    }

    public void setFisrtname(String fisrtname) {
        this.fisrtname = fisrtname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
