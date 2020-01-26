package dao;

import essense.Book;

import java.io.File;
import java.io.IOException;

interface BookDAO {
     void addBook(Book book) throws IOException;
     void delete();

}
