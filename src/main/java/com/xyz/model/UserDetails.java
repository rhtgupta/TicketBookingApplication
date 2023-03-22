package com.xyz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserDetails {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Address address;
}
