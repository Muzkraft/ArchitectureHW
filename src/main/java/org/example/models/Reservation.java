package org.example.models;


import java.util.Date;

public class Reservation {
    private int id;
    private Date date;
    private String name;
    private Table table;

    private static int counter = 1000;
    {
        id = ++counter;
    }

    public Reservation(Date date, String name, Table table) {
        this.date = date;
        this.name = name;
        this.table = table;
    }

    public int getId() {
        return id;
    }

    public Table getTable() {
        return table;
    }
}
