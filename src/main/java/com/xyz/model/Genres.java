package com.xyz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Genres {
    private final int id;
    private final GenresType type;
    private final List<Movie> movies;
}
