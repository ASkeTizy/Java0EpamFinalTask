package dao;

import java.io.IOException;

public class DAOFileException extends Exception {

    public DAOFileException(String message){
        super(message);
    }
     DAOFileException(String message, Exception e){
        super(message,e);
    }

}
