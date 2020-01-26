package dao;

public class FileDAOFactory extends DAOFactory {
    @Override
    public BookDAO getBookDAO() {
        return new FileBookDAO();
    }

    @Override
    public UserDAO getUserDAO() {
        return new FileUserDAO();
    }
}

