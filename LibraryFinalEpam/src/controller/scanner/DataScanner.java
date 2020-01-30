package controller.scanner;

import java.util.Scanner;

public class DataScanner {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String getLine() {
        return SCANNER.nextLine();
    }
}
