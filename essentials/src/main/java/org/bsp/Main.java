package org.bsp;

import lombok.Data;
import lombok.ToString;

import java.util.Collections;
import java.util.List;

public class Main {

    public List<Book> getBooksinSort() {
        List<Book> books = BookDAO.getBooks();
        Collections.sort(books, (b1, b2) -> b2.getName().compareTo(b1.getName()));
        return books;
    }
    public static void main(String[] args) {
        System.out.println(new Main().getBooksinSort());
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