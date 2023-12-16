package com.spring.managementsytem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity // providing automatic generation of getters, setters, and constructors (with and without arguments).
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookedRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long bookingId;

    @Column(name = "check_In")
    private LocalDate checkInDate;
    @Column(name = "check_Out")
    private  LocalDate checkOutDate;
    @Column(name = "Guest_FullName")
    private String guestFullName;
    @Column(name = "Guest_Email")
    private String guestEmail;
    @Column(name = "adults")
    private int NumOfChildren;
    @Column(name = "children")
    private int NumOfAdults;
    @Column(name = "total_guest")
    private int totalNumOfGuest;
    @Column(name = "Confirmation_Code")// specify that the field bookingConfirmationCode in a JPA entity should be mapped to a database column named "Confirmation_Code," defining the column name explicitly in the database schema.
    private String bookingConfirmationCode;

    @ManyToOne(fetch = FetchType.LAZY)//  association should be fetched lazily and uses the room_id column as the foreign key in the database.
    @JoinColumn(name = "room_id")
    private Room room;

    public void calculateTotalNumberOfGuest(){
        this.totalNumOfGuest = this.NumOfAdults + NumOfChildren;
    }

    public void setNumOfChildren(int numOfChildren) {
        NumOfChildren = numOfChildren;
        calculateTotalNumberOfGuest();
    }

    public void setNumOfAdults(int numOfAdults) {
        NumOfAdults = numOfAdults;
        calculateTotalNumberOfGuest();
    }

    public void setBookingConfirmationCode(String bookingConfirmationCode) {
        this.bookingConfirmationCode = bookingConfirmationCode;
    }

    public void setRoom(Room room) {
    }
}
