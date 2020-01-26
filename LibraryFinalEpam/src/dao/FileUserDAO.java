package dao;

import essense.User;

import java.io.*;

public class FileUserDAO implements UserDAO {
    private static File file=new File("D:\\work\\ja\\LibraryFinalEpam\\src\\resorces", "UserDB.dat");

    public FileUserDAO() {

    }

    public void create() {
        //file =
    }

    @Override
    public void add(User user) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file,true));
        oos.writeObject(user);
        oos.flush();
        oos.close();

    }

    @Override
    public boolean read(User user) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        return inputStream.readObject().equals(user);


    }

    @Override
    public void delete() throws IOException {
        FileWriter fstream1 = new FileWriter(file);
        BufferedWriter bf = new BufferedWriter(fstream1);
        bf.write("");
        bf.close();
    }
}
