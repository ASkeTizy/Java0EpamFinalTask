package services;

import dao.FileUserDAO;
import essense.User;

import java.io.IOException;

public class ClientService {
    public void signIn(String login, String password){
        try {
            new FileUserDAO().read(new User(login,password));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
