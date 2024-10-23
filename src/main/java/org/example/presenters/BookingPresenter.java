package org.example.presenters;

import org.example.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver{
    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    /**
     * получение списка всех столиков
     */
    public Collection<Table> loadTables(){
        return model.loadTables();
    }

    /**
     * отобразить список столиков (на представлении)
     */
    public void updateUIShowTables(){
        view.showTables(loadTables());
    }

    public void updateUiIShowReservationTableResult(int reservationNo){
        view.showReservationTableResult(reservationNo);
    }
    /**
     * Произошло событие, пользователь нажал на кнопку резервирования столика
     * @param date
     * @param tableNo
     * @param name
     */
    @Override
    public void onReservationTable(Date date, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(date, tableNo, name);
            updateUiIShowReservationTableResult(reservationNo);
            reservationStatus(tableNo);


        }
        catch (RuntimeException e) {
            updateUiIShowReservationTableResult(-1);
        }
    }

    @Override
    public boolean reservationStatus(int tableNo) {
        return true;
    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        try {

            int reservationNo = model.changeReservationTable(oldReservation,reservationDate, tableNo, name);
            updateUiIShowReservationTableResult(reservationNo);
        }
        catch (RuntimeException e){
            updateUiIShowReservationTableResult(-1);
        }
    }
}
