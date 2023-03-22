package com.xyz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class MovieLanguage {
    private final int id;
    private final MovieLanguageTypes movieLanguage;
    private final List<Movie> movies;
}
