package dao;

public abstract class DAOFactory {
    public static final int FILE = 1;

    public abstract UserDAO getUserDAO();
    public abstract  BookDAO getBookDAO();
    public static DAOFactory getDAOFActory(int whichFactory) {
        switch (whichFactory) {
            case FILE:
                return new FileDAOFactory();
            default:
                return null;
        }

    }
}
