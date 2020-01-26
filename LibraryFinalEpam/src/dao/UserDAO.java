package dao;

import essense.User;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface UserDAO {
     void add(User user) throws IOException;
    void delete() throws IOException;
    boolean read(User user) throws IOException, ClassNotFoundException;
}
