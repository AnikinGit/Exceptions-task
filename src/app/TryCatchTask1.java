package app;

import java.util.Scanner;

public class TryCatchTask1 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Exception: " + e);
        }
    }
}
