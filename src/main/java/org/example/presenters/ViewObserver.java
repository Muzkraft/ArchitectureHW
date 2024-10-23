package org.example.presenters;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date date, int tableNo, String name);
    boolean reservationStatus(int tableNo);

    void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
