package com.xyz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Address {
    private final String add1;
    private final String add2;
    private final City city;
    private final int pinCode;
}
