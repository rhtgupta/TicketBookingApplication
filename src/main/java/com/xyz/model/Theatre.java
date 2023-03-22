package com.xyz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Theatre {
    private final int id;
    private final String name;
    private final List<Screen> screens;
    private final City city;
}
