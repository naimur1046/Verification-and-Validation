package org.rumel.Fake;

public class BookService
{
    private BookRepository bookRepository;
    BookService(BookRepository bookRepository)
    {
        this.bookRepository=bookRepository;

    }
    public  void addBook(Book book)
    {
        bookRepository.save(book);

    }
    public int findNumberOfBooks()
    {
        return bookRepository.findAll().size();
    }
}
