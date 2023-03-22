package com.xyz.service;

import com.xyz.model.Movie;
import com.xyz.model.Screen;
import com.xyz.utils.Constants;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    public Movie getMovie(final int movieId) {
        return Constants.MOVIE_MAP.get(movieId);
    }
}
