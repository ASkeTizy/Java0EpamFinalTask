package dao;

import essense.Book;

public interface BookDAO {
     void addBook(Book book) throws  DAOFileException;
     boolean find(Book book) throws DAOFileException;

}
