package com.xyz.utils;

import com.xyz.model.*;

import java.util.HashMap;
import java.util.Map;

public class Constants {

    // Storing the data in memory.
    public static Map<Integer, Theatre> THEATRE_MAP = new HashMap<>();
    public static Map<Integer, Screen> SCREEN_MAP = new HashMap<>();
    public static Map<Integer, Movie> MOVIE_MAP = new HashMap<>();
    public static Map<Integer, Show> SHOW_MAP = new HashMap<>();
    public static Map<Integer, Seat> SEAT_MAP = new HashMap<>();

    static {
        MOVIE_MAP.put(111, new Movie(111, "Movie1"));
        MOVIE_MAP.put(222, new Movie(222, "Movie2"));
        MOVIE_MAP.put(333, new Movie(333, "Movie3"));

        SEAT_MAP.put(123, new Seat(111, 1, 1, BookingStatus.NEW));
        SEAT_MAP.put(456, new Seat(222, 1, 2, BookingStatus.NEW));
        SEAT_MAP.put(789, new Seat(333, 1, 3, BookingStatus.NEW));
    }

}
