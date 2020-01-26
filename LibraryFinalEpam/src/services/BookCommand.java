package services;

import dao.FileBookDAO;
import essense.Book;

import java.io.IOException;

public class BookCommand {
    public void addBook(String name,String author) throws IOException {
        new FileBookDAO().addBook(new Book(name,author));
    }
}
