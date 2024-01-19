package org.rumel.annotationSupport;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class annotationTest
{
    @Mock
    private BookRepository bookRepository;

    @Test
    public void demoCreateMocksUsingAnnotation()
    {
        BookService bookService=new BookService(bookRepository);
        Book book1=new Book("123","bongokotha",300, LocalDate.now());
        Book book2=new Book("234","Shonkhonil Karagare",234,LocalDate.now());

        Collection<Book> bookList =new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);

    }
}
