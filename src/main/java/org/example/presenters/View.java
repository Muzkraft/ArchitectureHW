package org.example.presenters;

import org.example.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {
    /**
     * Отображение списка столиков в приложении
     * @param tables список столиков
     */

    void showTables(Collection<Table> tables);

    /**
     * Отобразить результат бронирования столика
     * @param reservationNo номер брони
     */
    void showReservationTableResult(int reservationNo);

    /**
     * установить наблюдателя для представления
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);

    /**
     * Событие: Клиент нажал на кнопку резерва столика
     * @param orderDate
     * @param tableNo
     * @param name
     */
    void reservationTable(Date orderDate, int tableNo, String name);

    void changeReservationTable(int oldReservation, Date orderDate, int tableNo, String name);

}
