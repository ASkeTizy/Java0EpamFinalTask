package view;

import controller.Controller;
import controller.ControllerException;
import controller.scanner.DataScanner;

public class Main {



    public static void main(String[] args) throws ViewException {
        System.out.println("Input command");

        String ans ;
        do {

            try {
                ans = new Controller().executeTask(DataScanner.getLine());
            } catch (ControllerException e) {
                throw new ViewException (e);
            }
            System.out.println(ans);
        } while (!ans.equals("exit"));

    }
}
