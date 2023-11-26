package app;

import java.util.Scanner;

public class TryCatchTask3 {
    static double amountOnTheCard;

    public static void main(String[] args) {

        amountOnTheCard = 5000;
        double amountToBePaid;

        Scanner scanner = new Scanner(System.in);
        amountToBePaid = Double.parseDouble(scanner.nextLine());

        validate(amountOnTheCard, amountToBePaid);
    }

    public static void validate(double amountOnTheCard, double amountToBePaid){
        if (amountOnTheCard < amountToBePaid){
            throw new ArithmeticException("Insufficient funds on the card");
        } else {
            System.out.println("Payment was successful");
        }
    }
}
