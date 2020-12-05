package com.dkit.gd2.berktatar;

import java.time.LocalDate;
import java.util.Objects;

public class Student
{

    //We need: name, id, email, telephone, computersOnLoan

    private String id;
    private String name;
    private String email;
    private String telephone;
    private String computerOnLoan;

    public Student(String id, String name, String email, String telephone, String computerOnLoan) {
        this.id= id;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.computerOnLoan = computerOnLoan;   // convert from String in form "2020-12-01"
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getComputerOnLoan() {
        return computerOnLoan;
    }

    public void setComputerOnLoan(String computerOnLoan) {
        this.computerOnLoan = computerOnLoan;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(email, student.email) &&
                Objects.equals(telephone, student.telephone) &&
                Objects.equals(computerOnLoan, student.computerOnLoan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, telephone, computerOnLoan);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", computerOnLoan=" + computerOnLoan +
                '}';
    }

}
