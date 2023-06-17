package andfxx.p1.conditionalstatementsandconditionaloperation;

import java.util.Scanner;

public class ConditionalStatementsAndConditionalOperation {
    static Scanner scanner = new Scanner(System.in);

    public static void speedingTicket() {
        System.out.println("Give speed:");
        int speed = scanner.nextInt();
        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }

    public static void orwell() {
        System.out.println("Give a number:");
        int number = scanner.nextInt();
        if (number == 1984) {
            System.out.println("Orwell");
        }
    }

    public static void ancient() {
        System.out.println("Give a year:");
        int year = scanner.nextInt();
        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }

    public static void positivity() {
        System.out.println("Give a number:");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }

    public static void adulthood() {
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }
    }

    public static void largerThanOrEqualTo() {
        System.out.println("Give the first number:");
        int first = scanner.nextInt();
        System.out.println("Give the second number:");
        int second = scanner.nextInt();

        if (first > second) {
            System.out.println("Greater number is: " + first);
        } else if (second > first) {
            System.out.println("Greater number is: " + second);
        } else {
            System.out.println("The numbers are equal!");
        }
    }

    public static void gradesAndPoints() {
        System.out.println("Give a points [0-100]:");
        int points = scanner.nextInt();
        String grade = "incredible!";
        if (points < 0) {
            grade = "impossible!";
        } else if (points <= 49) {
            grade = "failed";
        } else if (points <= 59) {
            grade = "1";
        } else if (points <= 69) {
            grade = "2";
        } else if (points <= 79) {
            grade = "3";
        } else if (points <= 89) {
            grade = "4";
        } else if (points <= 100) {
            grade = "5";
        } else {
            // For points greater than 100, no else blocks is required since default grade is "incredible!"
            // But the following line is provided for clarity
            grade = "incredible!";
        }

        System.out.println("Grade: " + grade);
    }

    public static void oddOrEven() {
        System.out.println("Give a number:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
    }

    public static void stringComparison() {
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        if (input.equals("a string")) {
            System.out.println("Great! You read the instructions correctly.");
        } else {
            System.out.println("Missed the mark!");
        }
    }

    public static void password() {
        System.out.println("Password?");
        String password = scanner.nextLine();
        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }

    public static void same() {
        System.out.println("Enter the first string:");
        String first = scanner.nextLine();
        System.out.println("Enter the second string:");
        String second = scanner.nextLine();
        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }

    public static void checkingTheAge() {
        System.out.println("How old are you?");
        int age = Integer.parseInt(scanner.nextLine());
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }

    public static void leapYear() {
        System.out.print("Give a year: ");
        int year = Integer.parseInt(scanner.nextLine());
        if (year % 4 != 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("The year is not a leap year.");
        } else {
            System.out.println("The year is a leap year.");
        }
    }

    public static void giftTax() {
        System.out.println("Value of gift?");
        int value = Integer.parseInt(scanner.nextLine());
        if (value < 5000) {
            System.out.println("No tax!");
        } else {
            double tax = 0;
            if (value <= 25000) {
                tax = 100 + (value - 5000) * 0.08;
            } else if (value <= 55000) {
                tax = 1700 + (value - 25000) * 0.1;
            } else if (value <= 200000) {
                tax = 4700 + (value - 55000) * 0.12;
            } else if (value <= 1000000) {
                tax = 22100 + (value - 200000) * 0.15;
            } else {
                tax = 142100 + (value - 1000000) * 0.17;
            }

            System.out.println("Tax: " + tax);
        }
    }

    public static void conditionalStatementsAndConditionalOperation() {
        System.out.println("Hello world from andfxx.p1.conditionalstatementsandconditionaloperation");
    }
}
