package org.example.database;

import org.example.notes.infrastructure.persistence.Database;

public class NotesDatabase implements Database {

    NotesTable notesTable;

    public NotesTable getNotesTable() {
        if (notesTable == null){
            notesTable = new NotesTable();
        }
        return notesTable;
    }
}
