package org.rumel.Dummy;

import java.time.LocalDate;

public class Book {
    private String bookID;
    private String title;

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPublished(LocalDate published) {
        this.published = published;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getPublished() {
        return published;
    }

    private int price;
    private LocalDate published;

    public Book(String bookID, String title, int price, LocalDate published) {
        this.bookID = bookID;
        this.title = title;
        this.price = price;
        this.published = published;
    }
}
