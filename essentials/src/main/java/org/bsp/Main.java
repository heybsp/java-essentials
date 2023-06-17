package org.bsp;

import lombok.Data;
import lombok.ToString;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public List<Book> getBooksinSort() {
        List<Book> books = BookDAO.getBooks();
        Collections.sort(books, new MyComparator());
        return books;
    }
    public static void main(String[] args) {
        System.out.println(new Main().getBooksinSort());
    }
}

class MyComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b2.getName().compareTo(b1.getName());
    }
}

@Data
@ToString
class Book {
    private String name;
    public Book(String name) {
        this.name = name;
    }

}