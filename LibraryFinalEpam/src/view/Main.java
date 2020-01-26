package view;

import controller.Controller;
import dao.FileUserDAO;
import services.ServiceException;

import java.io.IOException;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws IOException, ClassNotFoundException, ServiceException {
        System.out.println("Input command");
        Scanner in=new Scanner(System.in);
        String ans = null;
        while (ans!="exit") {
            String s = in.nextLine();
             ans = new Controller().executeTask(s);
            System.out.println(ans);
        }

    }
}
