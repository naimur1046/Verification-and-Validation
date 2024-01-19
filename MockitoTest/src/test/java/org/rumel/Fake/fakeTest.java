package org.rumel.Fake;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class fakeTest
{
    @Test
    public void testFakeWithMockito()
    {
        BookRepository bookRepository= Mockito.mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        Book book1= new Book("123","Sonar Nolok",230, LocalDate.now());
        Book book2= new Book("677","Sotter Ferari",500, LocalDate.now());
        Collection<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        //  Mockito.when(bookRepository.findAll()).thenReturn(books);

        Assertions.assertEquals(0,bookService.findNumberOfBooks());

    }


}
