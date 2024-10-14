package org.example;

import java.util.Collection;

/**
 * DB interface
 */
public interface Database {
    void load();
    void save();

    Collection<Entity> getAll();


}
