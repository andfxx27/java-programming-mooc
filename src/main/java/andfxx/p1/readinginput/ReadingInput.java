package andfxx.p1.readinginput;

import java.util.Scanner;

public class ReadingInput {
    static Scanner scanner = new Scanner(System.in);

    public static void inputMessage() {
        System.out.print("Write a message: ");

        String message = scanner.nextLine();

        System.out.println(message);
    }

    public static void messageThreeTimes() {
        System.out.print("Write a message: ");

        String message = scanner.nextLine();

        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }

    public static void greeting() {
        System.out.print("What's your name? ");

        String name = scanner.nextLine();

        System.out.println("Hi " + name);
    }

    public static void conversation() {
        System.out.print("Greetings! How are you doing? ");

        String m1 = scanner.nextLine();

        System.out.print("Oh, how interesting. Tell me more! ");

        String m2 = scanner.nextLine();

        System.out.println("Thanks for sharing!");
    }

    public static void story() {
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.print("What is the main character called? ");

        String name = scanner.nextLine();

        System.out.print("What is their job? ");

        String job = scanner.nextLine();

        System.out.printf("""
                    Here is the story:
                    Once upon a time there was %s, who was %s.
                    On the way to work, %s reflected on life.
                    Perhaps %s will not be %s forever.
                %n""", name, job, name, name, job);
    }

    public static void readingInput() {
        System.out.println("Hello world from andfxx.p1.readinginput");
    }
}
