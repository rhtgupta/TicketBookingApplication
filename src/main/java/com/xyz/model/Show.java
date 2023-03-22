package com.xyz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
public class Show {
    private final int id;
    private final Movie movie;
    private final Screen screen;
    private final List<Seat> seats;
    private final Date startTime;
    private final int duration;
}
