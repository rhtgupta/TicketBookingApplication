package com.xyz.service;

import com.xyz.exceptions.SeatUnavailableException;
import com.xyz.model.Booking;
import com.xyz.model.Seat;
import com.xyz.model.Show;
import com.xyz.utils.SeatLocking;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;

public class BookingService {


    public Booking createBooking(final String user, final List<Seat> seats, final Show show) {
        // Need to check id seat is available.
        // marked seat as blocked.
        // make payment.
        // if payment successful marked seat as confirmed, else marked seat as expired.
        return new Booking(123, user, show, seats);
    }
}

