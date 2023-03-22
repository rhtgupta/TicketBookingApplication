package com.xyz.controller;

import com.xyz.model.Movie;
import com.xyz.model.Screen;
import com.xyz.model.Show;
import com.xyz.service.MovieService;
import com.xyz.service.ScreenService;
import com.xyz.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/show")
public class ShowController {

    @Autowired
    private ShowService showService;
    @Autowired
    private MovieService movieService;
    @Autowired
    private ScreenService screenService;

    @PostMapping("/addShow")
    public ResponseEntity<Show> addShow(@RequestParam Integer screenId,
                                        @RequestParam Integer movieId,
                                        @RequestParam List<Integer> seatsIds,
                                        @RequestParam Date startTime,
                                        @RequestParam Integer duration) {
        Screen screen = screenService.getScreen(screenId);
        Movie movie = movieService.getMovie(movieId);
        return new ResponseEntity<>(showService.addShow(screenId, movieId, seatsIds, startTime, duration), HttpStatus.CREATED);
    }

    // Similarly we can have other methods to update and delete

}
