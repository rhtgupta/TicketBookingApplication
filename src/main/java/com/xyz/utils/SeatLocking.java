package com.xyz.utils;

import com.xyz.model.Seat;
import com.xyz.model.Show;
import org.springframework.stereotype.Component;

import java.util.List;

// TOD: Need to write implementation class for this interface.

@Component
public interface SeatLocking {
    void lockSeats(Show show, List<Seat> seat, String user);

    void unlockSeats(Show show, List<Seat> seat);

    List<Seat> getLockedSeats(Show show);


}
