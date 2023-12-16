package com.spring.managementsytem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

@Entity // providing automatic generation of getters, setters, and constructors
@Getter
@Setter
@AllArgsConstructor
public class Room {
    @Id // In this code snippet, @Id denotes that the field id is the primary key of a JPA entity, and @GeneratedValue(strategy = GenerationType.IDENTITY) specifies that the database will automatically generate unique values for this identifier using an identity column, typically used for auto-incrementing primary keys in relational databases.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private boolean isBooked = false;
    @Lob
    private Blob photo;//typically represents binary large objects, such as images
    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY, cascade = CascadeType.ALL) // if you save or delete the Room entity, the changes will be propagated to the associated BookedRoom entities.
    private List<BookedRoom> bookings;

    public Room() {
        this.bookings = new ArrayList<>();
    }

    public void addBooking(BookedRoom booking){
        if (bookings == null){
            bookings = new ArrayList<>();
        }
        bookings.add(booking);
        booking.setRoom(this);
        isBooked = true;
        String bookingCode = RandomStringUtils.randomNumeric(10);
        booking.setBookingConfirmationCode(bookingCode);
    }
}
