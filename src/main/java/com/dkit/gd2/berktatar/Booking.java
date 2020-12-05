package com.dkit.gd2.berktatar;


import java.time.LocalDate;
import java.util.Objects;

public class Booking
{
    private String id;
    private String studentID;
    private String computerType;
    private String computerAssetTag;
    private LocalDate bookingDate;

    public Booking(String id, String studentID, String computerType, String computerAssetTag, String strDate) {
        this.id= id;
        this.studentID = studentID;
        this.computerType = computerType;
        this.computerAssetTag = computerAssetTag;
        this.bookingDate = LocalDate.parse(strDate);   // convert from String in form "2020-12-01"
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getComputerType() {
        return computerType;
    }

    public void setComputerAssetTag(String computerAssetTag) {
        this.id = computerAssetTag;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = LocalDate.parse(bookingDate);
    }
    public void setBirthDate(LocalDate bookingDate) { // overloaded method
        this.bookingDate = bookingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(id, booking.id) &&
                Objects.equals(studentID, booking.studentID) &&
                Objects.equals(computerType, booking.computerType) &&
                Objects.equals(computerAssetTag, booking.computerAssetTag) &&
                Objects.equals(bookingDate, booking.bookingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentID, computerType, computerAssetTag, bookingDate);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", name='" + studentID + '\'' +
                ", email='" + computerType + '\'' +
                ", telephone='" + computerAssetTag + '\'' +
                ", bookingDate=" + bookingDate +
                '}';
    }
}
