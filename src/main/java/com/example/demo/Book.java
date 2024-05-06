package com.example.demo;

import java.util.Arrays;
import java.util.List;

public record Book (String id, String name, int pageCount, String authorId) {
    private static List<Book> books = Arrays.asList(
        new Book("book-1", "Effective Java", 416, "author-1"),
        new Book("book-2", "Clean Code", 464, "author-2"),
        new Book("book-3", "Java: A Beginner's Guide", 728, "author-3")
    );
    
    public static Book getById(String id) {
        return 
        books.stream().filter(book -> book.id().equals(id))
        .findFirst().orElse(null);
    }
}