package app;

import java.util.Scanner;

public class TryCatchTask2 {
    public static void main(String[] args) {

        int[] productPrice = new int[]{4, 4, 5, 7, 8 };

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter index");
            int price = productPrice[Integer.parseInt(scanner.nextLine())];
            System.out.println("Price by index: " + price);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: " + e);
        }

    }
}
