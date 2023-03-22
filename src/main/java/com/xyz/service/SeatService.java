package com.xyz.service;

import com.xyz.model.BookingStatus;
import com.xyz.model.Movie;
import com.xyz.model.Seat;
import com.xyz.model.Show;
import com.xyz.utils.Constants;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeatService {
    public List<Seat> getAvailableSeats(final int showId) {
        Show show = Constants.SHOW_MAP.get(showId);
        List<Seat> allSeats = show.getSeats();
        return allSeats.stream().filter(seat -> seat.getStatus().equals(BookingStatus.NEW) || seat.getStatus().equals(BookingStatus.EXPIRED)).collect(Collectors.toList());
    }

    public List<Seat> getSeats(final List<String> seatsIds) {
        List<Seat> seats = new ArrayList<>();
        for (String seat : seatsIds) {
            seats.add(Constants.SEAT_MAP.get(seat));
        }
        return seats;
    }
}
