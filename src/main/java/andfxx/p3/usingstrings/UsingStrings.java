package andfxx.p3.usingstrings;

import java.util.Scanner;

public class UsingStrings {
    static Scanner scanner = new Scanner(System.in);

    public static void usingStrings() {
        System.out.println("Hello world from andfxx.p3.usingstrings");

        personalDetails();
    }

    private static void personalDetails() {
        int yearSum = 0;
        int yearCount = 0;
        int max = 0;
        String longestName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] splitInput = input.split(",");
            int birthYear = Integer.parseInt(splitInput[1]);
            yearSum += birthYear;
            yearCount++;
            if (splitInput[0].length() > max) {
                max = splitInput[0].length();
                longestName = splitInput[0];
            }
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * yearSum / yearCount));
    }

    private static void nameOfTheOldest() {
        int max = 0;
        String oldestPersonName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] splitInput = input.split(",");
            int age = Integer.parseInt(splitInput[1]);
            if (age > max) {
                max = age;
                oldestPersonName = splitInput[0];
            }
        }

        System.out.println("Name of the oldest: " + oldestPersonName);
    }

    private static void ageOfTheOldest() {
        int max = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] splitInput = input.split(",");
            int age = Integer.parseInt(splitInput[1]);
            if (age > max) {
                max = age;
            }
        }

        System.out.println("Age of the oldest: " + max);
    }

    private static void lastWords() {
        while (true) {
            System.out.println("Enter sentence:");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] splitInput = input.split(" ");
            System.out.println(splitInput[splitInput.length - 1]);
        }
    }

    private static void firstWords() {
        while (true) {
            System.out.println("Enter sentence:");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] splitInput = input.split(" ");
            System.out.println(splitInput[0]);
        }
    }

    private static void avClub() {
        while (true) {
            System.out.println("Enter sentence:");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] splitInput = input.split(" ");
            for (String str : splitInput) {
                if (str.contains("av")) {
                    System.out.println(str);
                }
            }
        }
    }

    private static void lineByLine() {
        while (true) {
            System.out.println("Enter sentence:");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] splitInput = input.split(" ");
            for (String str : splitInput) {
                System.out.println(str);
            }
        }
    }

    private static void login() {
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if ((username.equals("alex") && password.equals("sunshine")) || (username.equals("emma") && password.equals("haskell"))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }

    private static void isItTrue() {
        System.out.print("Give a word: ");
        String input = scanner.nextLine();
        if (input.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }

    private static void printThrice() {
        System.out.print("Give a word: ");
        String input = scanner.nextLine();
        System.out.println(input + input + input);
    }
}
