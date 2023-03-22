package com.xyz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;
import java.util.Date;

@AllArgsConstructor
@Getter
public class SeatLock {
    private Integer timeoutInMillis;
    private Date lockTime;
    private String lockedBy;

    public boolean isLockExpired() {
        final Instant lockInstant = lockTime.toInstant().plusMillis(timeoutInMillis);
        final Instant currentInstant = new Date().toInstant();
        return lockInstant.isBefore(currentInstant);
    }

}
