package org.example.presenters;

import java.util.Date;

public interface ViewObserver {
    public void onReservationTable(Date date, int tableNo, String name);
}
