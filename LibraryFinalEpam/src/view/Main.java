package view;

import controller.Controller;
import controller.ControllerException;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws ViewException {
        System.out.println("Input command");
        Scanner in=new Scanner(System.in);
        String ans ;
        do {
            String s = in.nextLine();
            try {
                ans = new Controller().executeTask(s);
            } catch (ControllerException e) {
                throw new ViewException (e);
            }
            System.out.println(ans);
        } while (!ans.equals("exit"));

    }
}
