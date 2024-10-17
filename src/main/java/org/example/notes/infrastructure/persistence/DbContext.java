package org.example.notes.infrastructure.persistence;

import org.example.notes.core.domain.Note;

import java.util.Collection;

public abstract class DbContext {
    protected Database database;

    public DbContext(Database database) {
        this.database = database;
    }

    protected abstract void onModelCreating(ModelBuilder builder);

    public boolean saveChanges(){
//        TODO: Сохранение изменений в БД
        return true;
    }

    public void add(){

    }
}

class ModelBuilder{
    public ModelBuilder applyConfiguration(ModelConfiguration configuration){
//        TODO: добавление конфигурации маппинга объекта некоторого типа к структуре БД
        return this;
    }
}
