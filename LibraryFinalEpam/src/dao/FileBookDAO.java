package dao;

import essense.Book;

import java.io.*;

public class FileBookDAO implements BookDAO {
    private static File file=new File("D:\\work\\ja\\LibraryFinalEpam\\src\\resorces", "BookDB.dat");

    @Override
    public void addBook(Book book) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file,true));
        oos.writeObject(book);
        oos.flush();
        oos.close();
    }

    @Override
    public void delete() {

    }
}
