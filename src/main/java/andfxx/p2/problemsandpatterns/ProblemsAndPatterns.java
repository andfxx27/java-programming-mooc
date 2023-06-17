package andfxx.p2.problemsandpatterns;

import java.util.Scanner;

public class ProblemsAndPatterns {
    static Scanner scanner = new Scanner(System.in);

    public static void squared() {
        System.out.println("Give an integer:");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(num + " squared is " + (num * num));
    }

    public static void squareRootOfSum() {
        System.out.println("Give first integer:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give second integer:");
        int second = Integer.parseInt(scanner.nextLine());
        int sum = first + second;
        System.out.println("Square root sum of " + first + " and " + second + " is " + Math.sqrt(sum));
    }

    public static void absoluteValue() {
        System.out.println("Give an integer:");
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 0) {
            num = num * -1;
        }
        System.out.println(num);
    }

    public static void comparingNumbers() {
        System.out.println("Give first integer:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give second integer:");
        int second = Integer.parseInt(scanner.nextLine());
        if (first > second) {
            System.out.println(first + " is greater than " + second + ".");
        } else if (first < second) {
            System.out.println(first + " is smaller than " + second + ".");
        } else {
            System.out.println(first + " is equal to " + second + ".");
        }
    }

    public static void carryOn() {
        while (true) {
            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();
            if (input.equals("no")) {
                break;
            }
        }
    }

    public static void areWeThereYet() {
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 4) {
                break;
            }
        }
    }

    public static void onlyPositives() {
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 0) {
                System.out.println("Unsuitable number");
            } else if (number > 0) {
                System.out.println(number * number);
            } else {
                break;
            }
        }
    }

    public static void numberOfNumbers() {
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            }

            count++;
        }

        System.out.println("Number of numbers: " + count);
    }

    public static void numberOfNegativeNumbers() {
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            }

            if (number < 0) {
                count++;
            }
        }

        System.out.println("Number of negative numbers: " + count);
    }

    public static void sumOfNumbers() {
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("Sum of the numbers: " + sum);
    }

    public static void numberAndSumOfNumbers() {
        int sum = 0;
        int numbersCount = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            }

            sum += number;
            numbersCount++;
        }

        System.out.println("Number of numbers: " + numbersCount);
        System.out.println("Sum of the numbers: " + sum);
    }

    public static void averageOfNumbers() {
        double sum = 0;
        int numbersCount = 0;
        while (true) {
            System.out.println("Give a number:");
            double number = Double.parseDouble(scanner.nextLine());
            if (number == 0) {
                break;
            }

            sum += number;
            numbersCount++;
        }

        System.out.println("Average of the numbers: " + (sum / numbersCount));
    }

    public static void averageOfPositiveNumbers() {
        double sum = 0;
        int numbersCount = 0;
        while (true) {
            System.out.println("Give a number:");
            double number = Double.parseDouble(scanner.nextLine());
            if (number == 0) {
                break;
            }

            if (number > 0) {
                sum += number;
                numbersCount++;
            }
        }

        if (numbersCount > 0) {
            System.out.println("Average of the numbers: " + (sum / numbersCount));
        } else {
            System.out.println("Cannot calculate the average");
        }
    }

    public static void problemsAndPatterns() {
        System.out.println("Hello world from andfxx.p2.problemsandpatterns");
    }
}
