package dao;

import essense.User;

import java.io.*;
import java.util.ArrayList;

public class FileUserDAO implements UserDAO {
    private static File file = new File("D:\\work\\ja\\LibraryFinalEpam\\src\\resorces", "UserDB.dat");
    private static ArrayList<User> users = new ArrayList<>();

    FileUserDAO() {

    }


    @Override
    public void add(User user) throws DAOFileException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            users.add(user);
            oos.writeObject(users);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            throw new DAOFileException("Add User error", e);
        }


    }

    @Override
    public boolean read(User user) throws DAOFileException {
        ObjectInputStream inputStream = null;

        try {

            FileInputStream fis = new FileInputStream(file);
            inputStream = new ObjectInputStream(fis);
            ArrayList<User> arr = (ArrayList<User>) inputStream.readObject();

            for (User iter : arr) {
                if(iter.equals(user)) return true;

            }

        }
        catch (IOException e) {
            throw new DAOFileException("Read file exception", e);
            } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete() throws DAOFileException {
        FileWriter fstream1 = null;
        try {
            fstream1 = new FileWriter(file);
        } catch (IOException e) {
            throw new DAOFileException("File error", e);
        }
        BufferedWriter bf = new BufferedWriter(fstream1);
        try {
            bf.write("");
            bf.close();
        } catch (IOException e) {
            throw new DAOFileException("Buffer write error", e);
        }

    }
}
