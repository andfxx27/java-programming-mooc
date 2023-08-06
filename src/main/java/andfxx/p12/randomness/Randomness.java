package andfxx.p12.randomness;

import andfxx.p12.randomness.die.Die;
import andfxx.p12.randomness.lottery.LotteryRow;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Randomness {
    public static void randomness() {
        System.out.println("Hello world from andfxx.p12.randomness");

        lottery();
    }

    private static void lottery() {
        LotteryRow row = new LotteryRow();
        ArrayList<Integer> lotteryNumbers = (ArrayList<Integer>) row.numbers();

        System.out.println("Lottery numbers:");
        for (int number: lotteryNumbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    private static void die() {
        Die die = new Die(6);

        for (int i = 0; i < 10; i++) {
            System.out.println(die.throwDie());
        }
    }

    private static void numbers() {
        System.out.print("How many numbers should be printed? ");

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Random random = new Random();

        for (int i = 0; i < count; i++) {
            System.out.println(random.nextInt(11));
        }
    }
}
