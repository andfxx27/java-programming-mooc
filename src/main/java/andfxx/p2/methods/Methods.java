package andfxx.p2.methods;

import java.util.Scanner;

public class Methods {
    static Scanner scanner = new Scanner(System.in);

    public static void methods() {
        System.out.println("Hello world from andfxx.p2.methods");
        christmasTree(10);
    }

    private static void greet() {
        System.out.println("Greetings!");
    }

    private static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }

    private static void reprint() {
        System.out.println("How many times?");
        int totalCount = Integer.parseInt(scanner.nextLine());
        int currentCount = 0;
        while (currentCount < totalCount) {
            printText();
            currentCount++;
        }
    }

    private static void printUntilNumber(int to) {
        for (int i = 1; i <= to; i++) {
            System.out.println(i);
        }
    }

    private static void printFromNumberToOne(int from) {
        for (int i = from; i >= 1; i--) {
            System.out.println(i);
        }
    }

    private static void division(int numerator, int denominator) {
        System.out.println((double) numerator / denominator);
    }

    private static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    private static int numberUno() {
        return 1;
    }

    private static String word() {
        return "Yakuza series is my favorite game";
    }

    private static int summation(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    private static int smallest(int num1, int num2) {
        return Math.min(num1, num2);
    }

    private static int greatest(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        }

        if (num2 > num1 && num2 > num3) {
            return num2;
        }

        return num3;
    }

    private static double average(int num1, int num2, int num3, int num4) {
        int sum = summation(num1, num2, num3, num4);
        return (double) sum / 4;
    }

    private static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    private static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            printStars(size);
            System.out.println();
        }
    }

    private static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
            System.out.println();
        }
    }

    private static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    private static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
            System.out.println();
        }
    }

    private static void christmasTree(int size) {
        int starsCount = 1;
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(starsCount);
            starsCount += 2;
            System.out.println();
        }

        printSpaces(size - 2);
        printStars(3);
        System.out.println();
        printSpaces(size - 2);
        printStars(3);
    }
}
