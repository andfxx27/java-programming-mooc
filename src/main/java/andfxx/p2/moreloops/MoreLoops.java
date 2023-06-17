package andfxx.p2.moreloops;

import java.util.Scanner;

public class MoreLoops {
    static Scanner scanner = new Scanner(System.in);

    public static void counting() {
        System.out.println("Give a number:");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void countingToHundred() {
        System.out.println("Give a number:");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = num; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void fromWhereToWhereP1() {
        System.out.print("Where to? ");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void fromWhereToWhereP2() {
        System.out.print("Where to? ");
        int to = Integer.parseInt(scanner.nextLine());
        System.out.print("Where from? ");
        int from = Integer.parseInt(scanner.nextLine());
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }

    public static void sumOfASequence() {
        System.out.print("Last number? ");
        int to = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= to; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }

    public static void sumOfASequenceTheSequel() {
        System.out.print("First number? ");
        int from = Integer.parseInt(scanner.nextLine());
        System.out.print("Last number? ");
        int to = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }

    public static void factorial() {
        System.out.print("Give a number: ");
        int num = Integer.parseInt(scanner.nextLine());
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Factorial: " + result);
    }

    public static void repeatingBreakingAndRemembering() {
        int sum = 0;
        int numbersCount = 0;
        int evenNumbersCount = 0;
        int oddNumbersCount = 0;

        System.out.println("Give numbers:");
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }

            sum += num;
            numbersCount++;

            if (num % 2 == 0) evenNumbersCount++;
            if (num % 2 == 1) oddNumbersCount++;
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbersCount);
        System.out.println("Average: " + (sum / (double) numbersCount));
        System.out.println("Even: " + evenNumbersCount);
        System.out.println("Odd: " + oddNumbersCount);
    }

    public static void moreLoops() {
        System.out.println("Hello world from andfxx.p2.moreloops");
    }
}
