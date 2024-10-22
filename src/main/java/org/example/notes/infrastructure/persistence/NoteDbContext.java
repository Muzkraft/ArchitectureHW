package org.example.notes.infrastructure.persistence;

import org.example.database.NotesDatabase;
import org.example.database.NotesRecord;
import org.example.notes.core.application.interfaces.NotesDatabaseContext;
import org.example.notes.core.domain.Note;
import org.example.notes.infrastructure.persistence.configurations.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;

public class NoteDbContext extends DbContext implements NotesDatabaseContext {

    public NoteDbContext(Database database) {
        super(database);
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }

    @Override
    public Collection<Note> getAll() {
        Collection<Note> notesList = new ArrayList<>();
//        TODO: Этого кастинга быть не должно, тут должен работать внутренний механизм фреймворка
        for (NotesRecord record: ((NotesDatabase)database).getNotesTable().getRecords()){
            notesList.add(new Note(
                    record.getId(),
                    record.getUserId(),
                    record.getTitle(),
                    record.getDetails(),
                    record.getCreationDate()
            ));
        }
        return notesList;
    }

}
