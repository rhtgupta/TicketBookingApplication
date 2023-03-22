package com.xyz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Booking {
    private final int id;
    private final String user;
    private final Show show;
    private final List<Seat> seats;
}
