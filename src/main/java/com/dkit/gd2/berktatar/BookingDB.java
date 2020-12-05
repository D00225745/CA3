package com.dkit.gd2.berktatar;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookingDB
{
    private ArrayList<Booking> bookingList;

    public BookingDB() {
        this.bookingList = new ArrayList<>();
    }

    public Booking findBookingById(String id) {
        for(Booking s : bookingList ) {
            if(s.getId().equals(id))
                return s;
        }
        return null;    // not found
    }

    public void addBooking( Booking s) {    //TODO prevent duplicates
        bookingList.add( s );
    }

    public void removeBookingById( String id ) {
        Booking booking = findBookingById( id );    //TODO check for null id
        if( booking != null)
            bookingList.remove(booking);

    }

        public void loadBookingsFromFile() {
        // open 'bookings.txt' file
        // read records and instantiate new Booking objects
        // add each new booking object to bookingList
        // end.

        // Could initially hardcode some values here instead of reading from file
        // bookingList.add( new Booking("D012","Frank","1998-10-26"));
        //  etc - hard code more values


        System.out.println("Reading booking DB from file...");

        try {
            Scanner sc = new Scanner(new File("bookings.txt"));

            while (sc.hasNext()) {

                String id = sc.next();
                String studentID = sc.next();
                String computerType = sc.next();
                String computerAssetTag = sc.next();
                String strBookingDate = sc.next();

                System.out.println("ID: " + id + " Stuent ID: " + studentID + " Computer Type: " + computerType + " Telephone: " + computerAssetTag +  " Booking date: " + strBookingDate);

                bookingList.add( new Booking(id, studentID, computerType, computerAssetTag, strBookingDate));

            }
            System.out.println("All bookings loaded");
            sc.close();
            System.out.println("All Bookings: " + bookingList); // print them all

        } catch (IOException e) {
            System.out.println("IOException thrown in loadBookingsFromFile() "+e.getMessage());
        }

    }


}
