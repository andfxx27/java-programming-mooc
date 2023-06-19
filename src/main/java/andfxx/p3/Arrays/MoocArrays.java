package andfxx.p3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoocArrays {
    static Scanner scanner = new Scanner(System.in);

    public static void moocArrays() {
        System.out.println("Hello world from andfxx.p3.Arrays");

        printInStars();
    }

    private static void printInStars() {
        int[] array = {5, 1, 3, 4, 2};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printNeatly() {
        int[] array = {5, 1, 3, 4, 2};

        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
    }

    private static void sumOfArray() {
        int[] numbers = {5, 1, 3, 4, 2};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum);
    }

    private static void indexWasNotFound() {
        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        System.out.print("Search for? ");
        int numToSearchFor = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numToSearchFor) {
                System.out.println(numToSearchFor + " is at index " + i + ".");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(numToSearchFor + " was not found.");
        }
    }

    private static void swap() {
        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Ask user for two index to swap
        System.out.println("Give two indices to swap:");
        int idx1 = Integer.parseInt(scanner.nextLine());
        int idx2 = Integer.parseInt(scanner.nextLine());

        // Validate that idx1 and idx2 must be between 0 and numbers.length - 1
        if ((idx1 < 0 || idx1 > numbers.length - 1) || (idx2 < 0 || idx2 > numbers.length - 1)) {
            System.out.println("Index to swap must be between 0 and " + (numbers.length - 1));
            return;
        }

        int temp = numbers[idx1];
        numbers[idx1] = numbers[idx2];
        numbers[idx2] = temp;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    private static void arrayDeclaration() {
        int[] numbers = new int[3];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.println(Arrays.toString(numbers));
    }
}
