package com.xyz.utils;

import com.xyz.exceptions.SeatUnavailableException;
import com.xyz.model.Seat;
import com.xyz.model.SeatLock;
import com.xyz.model.Show;

import java.util.*;

public class SeatLockingProvider implements SeatLocking {
    private final Integer lockTimeout = 10 * 60 * 1000;
    private final Map<Show, Map<Seat, SeatLock>> locks = new HashMap<>();


    @Override
    public void lockSeats(final Show show, final List<Seat> seats, final String user) {
        synchronized (this) {
            for (Seat seat : seats) {
                if (isSeatLocked(show, seat)) {
                    throw new SeatUnavailableException("Seat is not available..!!");
                }
            }

            for (Seat seat : seats) {
                lockSeat(show, seat, user, lockTimeout);
            }
        }
    }

    @Override
    public void unlockSeats(final Show show, final List<Seat> seats) {
        for (Seat seat : seats) {
            unlockSeat(show, seat);
        }
    }


    @Override
    public List<Seat> getLockedSeats(Show show) {
        List<Seat> lockedSeats = new ArrayList<>();
        if (locks.containsKey(show)) {
            for (Seat seat : locks.get(show).keySet()) {
                lockedSeats.add(seat);
            }
        }
        return lockedSeats;
    }

    private boolean isSeatLocked(final Show show, final Seat seat) {
        return locks.containsKey(show) && locks.get(show).containsKey(seat) && locks.get(show).get(seat).isLockExpired();
    }

    private void lockSeat(final Show show, final Seat seat, final String user, final int lockTimeout) {
        if (!locks.containsKey(show)) {
            locks.put(show, new HashMap<>());
        }
        final SeatLock seatLock = new SeatLock(lockTimeout, new Date(), user);
        locks.get(show).put(seat, seatLock);
    }

    private void unlockSeat(final Show show, final Seat seat) {
        if (!locks.containsKey(show)) {
            return;
        }
        locks.get(show).remove(seat);
    }


}
