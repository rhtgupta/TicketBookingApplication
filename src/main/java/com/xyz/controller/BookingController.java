package com.xyz.controller;

import com.xyz.model.Booking;
import com.xyz.model.Seat;
import com.xyz.model.Show;
import com.xyz.service.BookingService;
import com.xyz.service.SeatService;
import com.xyz.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;
    @Autowired
    private SeatService seatService;
    @Autowired
    private ShowService showService;

    @PostMapping("/bookSeats")
    public ResponseEntity<Booking> createBooking(@RequestParam final String userId, @RequestParam final Integer showId,
                                                 @RequestParam final List<String> seatsIds) {
        Show show = showService.getShow(showId);
        List<Seat> seats = seatService.getSeats(seatsIds);
        return new ResponseEntity<>(bookingService.createBooking(userId, seats, show), HttpStatus.CREATED);
    }

}
