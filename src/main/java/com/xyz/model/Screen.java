package com.xyz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Screen {
    private final int id;
    private final String name;
    private final Theatre theatre;
}
