package org.example;

import org.example.database.NotesDatabase;
import org.example.notes.core.application.ConcreteNoteEditor;
import org.example.notes.core.domain.Note;
import org.example.notes.infrastructure.persistence.NoteDbContext;
import org.example.notes.presentation.queries.controllers.NotesController;
import org.example.notes.presentation.queries.views.NotesConsolePresenter;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        NotesController controller = new NotesController(new ConcreteNoteEditor(new NoteDbContext(new NotesDatabase()), new NotesConsolePresenter()));
        controller.routePrintAll();
        Note note = new Note(1, 1,"Title1", "detail1", new Date());
        System.out.println();
        controller.routeAddNote(note);

        controller.routeRemoveNote(note);
        controller.routePrintAll();
    }
}