package andfxx.p1.calculatingwithnumbers;

import java.util.Scanner;

public class CalculatingWithNumbers {
    static int SECONDS_IN_A_DAY = 86400;
    static Scanner scanner = new Scanner(System.in);

    public static void secondsInADay() {
        System.out.print("Give a number (days count): ");
        int days = Integer.parseInt(scanner.nextLine());
        System.out.println("There is " + (days * SECONDS_IN_A_DAY) + " seconds in " + days + " days.");
    }

    public static void sumOfTwoNumbers() {
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (first + second));
    }

    public static void sumOfThreeNumbers() {
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (first + second + third));
    }

    public static void additionFormula() {
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println(first + " + " + second + " = " + (first + second));
    }

    public static void multiplicationFormula() {
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println(first + " * " + second + " = " + (first * second));
    }

    public static void division() {
        int first = 3;
        int second = 2;
        double result = (double) first / second;
        System.out.println(result);
    }

    public static void averageOfTwoNumbers() {
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println("The average is " + 1.0 * (first + second) / 2);
    }

    public static void averageOfThreeNumbers() {
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());
        System.out.println("The average is " + 1.0 * (first + second + third) / 3);
    }

    public static void simpleCalculator() {
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println(first + " - " + second + " = " + (first - second));
        System.out.println(first + " * " + second + " = " + (1.0 * first * second));
        System.out.println(first + " / " + second + " = " + (1.0 * first / second));
    }

    public static void calculatingWithNumbers() {
        System.out.println("Hello world from andfxx.p1.calculatingwithnumbers");
    }
}
