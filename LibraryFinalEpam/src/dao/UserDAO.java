package dao;

import essense.User;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface UserDAO {
     void add(User user) throws  DAOFileException;
    void delete() throws  DAOFileException;
    boolean read(User user) throws  DAOFileException;
}
