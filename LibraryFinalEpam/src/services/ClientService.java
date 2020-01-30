package services;

import dao.DAOFactory;
import dao.DAOFileException;
import essense.Book;
import essense.User;

import java.util.Objects;

public class ClientService {
    public boolean signIn(String login, String password) throws ServiceException {
        try {
            return Objects.requireNonNull(DAOFactory.getDAOFActory(DAOFactory.FILE)).getUserDAO().read(new User(login,password));

        } catch (DAOFileException e) {
            throw new ServiceException("Sign in error",e);
        }

    }

    public void registrate(String login,String password) throws ServiceException{
        try {
            Objects.requireNonNull(DAOFactory.getDAOFActory(DAOFactory.FILE)).getUserDAO().add(new User(login,password));
        }
        catch (DAOFileException e){
            throw new ServiceException("User creation error",e);
        }
    }
    public void addBook(String name,String author) throws ServiceException{
        try {
            Objects.requireNonNull(DAOFactory.getDAOFActory(DAOFactory.FILE)).getBookDAO().addBook(new Book(name,author));
        }
        catch (DAOFileException e){
            throw new ServiceException("Book not added",e);
        }
    }
    public boolean findBook(String name,String author) throws ServiceException {
        try {
        return Objects.requireNonNull(DAOFactory.getDAOFActory(DAOFactory.FILE)).getBookDAO().find(new Book(name, author));
        } catch (DAOFileException e) {
            throw new ServiceException("Book not added", e);
        }
    }

}
