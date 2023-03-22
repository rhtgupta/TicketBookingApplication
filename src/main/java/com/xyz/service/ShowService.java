package com.xyz.service;

import com.xyz.model.*;
import com.xyz.utils.Constants;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ShowService {

    public Show addShow(final int screenId, final int movieId, final List<Integer> seatIds, final Date startTime, final int duration) {
        Show newShow = new Show(123, Constants.MOVIE_MAP.get(movieId), Constants.SCREEN_MAP.get(screenId), seatIds.stream().map(seatId -> Constants.SEAT_MAP.get(seatId)).collect(Collectors.toList()),
                startTime, duration);
        Constants.SHOW_MAP.put(123, newShow);
        return newShow;
    }

    public Show getShow(final int showId) {
        return Constants.SHOW_MAP.get(showId);
    }


}
