package org.rumel.Dummy;

public class BookService
{
    private BookRepository bookRepository;
    private EmailServices emailServices;

    public BookService(BookRepository bookRepository, EmailServices emailServices) {
        this.bookRepository = bookRepository;
        this.emailServices = emailServices;
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
