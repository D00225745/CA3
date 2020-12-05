package com.dkit.gd2.berktatar;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDB
{
    private ArrayList<Student> studentList;

    public StudentDB() {
        this.studentList = new ArrayList<>();
    }

    public Student findStudentById(String id) {
        for(Student s : studentList ) {
            if(s.getId().equals(id))
                return s;
        }
        return null;    // not found
    }

    public void addStudent( Student s) {    //TODO prevent duplicates
        studentList.add( s );
    }

    public void removeStudentById( String id ) {
        Student student = findStudentById( id );    //TODO check for null id
        if( student != null)
            studentList.remove(student);

    }

    public void loadStudentsFromFile() {


        System.out.println("Reading student DB from file...");

        try {
            Scanner sc = new Scanner(new File("students.txt"));

            while (sc.hasNext()) {

                String id = sc.next();
                String name = sc.next();
                String email = sc.next();
                String telephone = sc.next();
                String strLoanNum = sc.next();

                System.out.println("ID: " + id + " Name: " + name + " Email: " + email + " Telephone: " + telephone +  " Computers on Loan: " + strLoanNum);

                studentList.add( new Student(id, name, email, telephone, strLoanNum));

            }
            System.out.println("All students loaded");
            sc.close();
            System.out.println("All Students: " + studentList); // print them all

        } catch (IOException e) {
            System.out.println("IOException thrown in loadStudentsFromFile() "+e.getMessage());
        }

    }
}
