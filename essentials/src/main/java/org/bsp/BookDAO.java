package org.bsp;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public static List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("harry potter"));
        books.add(new Book("cricket book"));
        books.add(new Book("utopia"));
        books.add(new Book("revolution 2020"));
        books.add(new Book("fivepoint"));

        return books;
    }
}

