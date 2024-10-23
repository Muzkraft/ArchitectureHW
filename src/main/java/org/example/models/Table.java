package org.example.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {
    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик No %d, зарезервирован - %b", no, reserved);
    }

    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    private int no;
    private final Collection<Reservation> reservations = new ArrayList<>();

    private boolean reserved;

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    private static int counter;

    {
        no = ++counter;
    }
}
