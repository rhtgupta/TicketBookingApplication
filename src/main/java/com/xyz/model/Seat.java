package com.xyz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Seat {
    private final int id;
    private final int rowNo;
    private final int columnNo;
    private final BookingStatus status;
}
