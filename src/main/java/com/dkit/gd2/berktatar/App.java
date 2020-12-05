package com.dkit.gd2.berktatar;


import java.sql.SQLOutput;
import java.time.*;

import static java.time.temporal.ChronoUnit.DAYS;

public class App
{
    public static void main( String[] args )
    {

        System.out.println("\n\n******** Computer Part *******\n");

        //Create new instance of Computer
        Computer computer = new Computer("Computer", "Dell", "Intel Core i5 9th Gen", "8GB", "1TB", "3.5kg", "DKIT-24105", "18-11-20");

        System.out.println(computer);

        Desktop Del = new Desktop("Desktop", "Dell", "Intel Core i5 9th Gen", "8GB", "1TB", "3.5kg", "DKIT-24105", "18-11-20");
        System.out.println(Del);

        Laptop Dell = new Laptop("Laptop", "Dell", "Intel Core i7 9th Gen", "8GB", "1TB", "3.5kg", "DKIT-24105", "18-11-20", "9 inches", "3 hours");
        System.out.println(Dell);

        RaspberryPi Raspberry = new RaspberryPi("Raspberry Pi", "Raspberry Pi", "Arm Cortex-A53 CPU", "1GB", "32GB", "1kg", "DKIT-24105", "18-11-20");
        System.out.println(Raspberry);

        System.out.println("\n\n******** Student Part *******\n");

        Student s1 = new Student("D001", "Tom","tom@student.com","0002225545","5");
        System.out.println("Student: " + s1);

        Student s2 = new Student("D002", "Jean","jeanbean@student.com","0002569145","2");
        System.out.println("Student: " + s2);

        //
        StudentDB studentDb = new StudentDB();
        studentDb.addStudent( new Student("D888","Zoe","zoe@student.com","0002225543","3"));

        Student result = studentDb.findStudentById("D888");
        if(result!=null)
            System.out.println(result);
        else
            System.out.println("Not found");

        studentDb.loadStudentsFromFile();
        //

        System.out.println("\n\n******** Booking Part *******\n");


        Booking b1 = new Booking("12345","D001","Laptop","DKIT-204501", "2020-11-18");
        System.out.println("Booking: " + b1);
    }
}
