package org.example;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        StringBuilder libraryInfo = new StringBuilder("This Library contains the following books:\n");

        for (Book book : books) {
            libraryInfo.append(book).append("\n");
        }

        return libraryInfo.toString();
    }
}
