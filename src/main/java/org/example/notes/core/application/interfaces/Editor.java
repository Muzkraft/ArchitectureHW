package org.example.notes.core.application.interfaces;

import java.util.Collection;
import java.util.Optional;

public interface Editor<T, TId> {
    boolean add(T item);
    boolean edit(T item);
    boolean remove(T item);
    Collection<T> getAll();
    Optional<T> getById(TId id);

}
