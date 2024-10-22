package org.example.models;

import org.example.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * инициализация спискка столиков
     * @return
     */
    @Override
    public Collection<Table> loadTables() {
        if(tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     * @return
     */
    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table: tables) {
            if(table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name, table);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Ошибка бронирования столика. Повторите попытку позже.");
    }

    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        return -1;
    }
}
