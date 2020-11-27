package com.dkit.gd2.berktatar;


import java.sql.SQLOutput;

public class App
{
    public static void main( String[] args )
    {
        //Create new instance of Computer
        Computer computer = new Computer("Computer", "Dell", "Intel Core i5 9th Gen", "8GB", "1TB", "3.5kg", "DKIT-24105", "18-11-20");

        System.out.println(computer);

        Desktop Del = new Desktop("Desktop", "Dell", "Intel Core i5 9th Gen", "8GB", "1TB", "3.5kg", "DKIT-24105", "18-11-20");
        System.out.println(Del);

        Laptop Dell = new Laptop("Laptop", "Dell", "Intel Core i7 9th Gen", "8GB", "1TB", "3.5kg", "DKIT-24105", "18-11-20", "9 inches", "3 hours");
        System.out.println(Dell);

        RaspberryPi Raspberry = new RaspberryPi("Raspberry Pi", "Raspberry Pi", "Arm Cortex-A53 CPU", "1GB", "32GB", "1kg", "DKIT-24105", "18-11-20");
        System.out.println(Raspberry);
    }
}
