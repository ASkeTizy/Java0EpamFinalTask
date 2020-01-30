package dao;

import essense.Book;
import essense.User;

import java.io.*;
import java.util.ArrayList;

public class FileBookDAO implements BookDAO {
    private static File file = new File("D:\\work\\ja\\LibraryFinalEpam\\src\\resorces", "BookDB.dat");
    private static ArrayList<Book> books = new ArrayList<>();

    FileBookDAO() {
    }

    @Override
    public void addBook(Book book) throws DAOFileException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file ));
            books.add(book);
            oos.writeObject(books);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            throw new DAOFileException("Book not added",e);
        }

    }

    @Override
    public boolean find(Book book) throws DAOFileException {
        ObjectInputStream inputStream = null;

        try {

            FileInputStream fis = new FileInputStream(file);
            inputStream = new ObjectInputStream(fis);
            ArrayList<Book> arr = (ArrayList<Book>) inputStream.readObject();

            for (Book iter : arr) {
                if(iter.equals(book)) return true;

            }

        }
        catch (IOException e) {
            throw new DAOFileException("Read file exception", e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }


}

