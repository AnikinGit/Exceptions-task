package app;

import java.util.Scanner;

public class TryCatchTask4 {
    public static void main(String[] args) {

        double actualTemperature;

        Scanner scanner = new Scanner(System.in);
        actualTemperature = Double.parseDouble(scanner.nextLine());

        try {
            validateTemperature(actualTemperature);
        } catch (InvalidTemperatureException e) {
            System.out.println(e);;
        }
    }
    static void validateTemperature(double temperature) throws InvalidTemperatureException {
        if (temperature >= -10 && temperature <= 35) {
            System.out.println("OK. Temperature: " + temperature);
        } else {
            throw new InvalidTemperatureException("\nTemperature " + temperature +
                    " is wrong!");
        }
    }
}
