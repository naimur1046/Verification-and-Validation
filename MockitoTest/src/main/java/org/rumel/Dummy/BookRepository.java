package org.rumel.Dummy;

import java.util.Collection;

public interface BookRepository
{
    void save(Book book);

    Collection<Book> findAll();

}