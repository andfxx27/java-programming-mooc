package andfxx.p7.programmingparadigms;

import java.util.Scanner;

public class ProgrammingParadigms {
    private static Scanner scanner = new Scanner(System.in);

    public static void programmingParadigms() {
        System.out.println("Hello world from andfxx.p7.programmingparadigms");

        liquidContainersPart2();
    }

    private static void liquidContainersPart2() {
        Container c1 = new Container();
        Container c2 = new Container();

        while (true) {
            System.out.println(c1);
            System.out.println(c2);

            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if (command.equals("quit")) {
                break;
            }

            int amount = Integer.parseInt(parts[1]);

            switch (command) {
                case "add" -> {
                    c1.add(amount);
                }
                case "move" -> {
                    if (c1.contains() - amount < 0) {
                        c2.add(c1.contains());
                        c1.remove(c1.contains());
                    } else {
                        c1.remove(amount);
                        c2.add(amount);
                    }
                }
                case "remove" -> {
                    c2.remove(amount);
                }
            }
        }
    }

    private static void liquidContainers() {
        int first = 0;
        int second = 0;
        int containerLimit = 100;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if (command.equals("quit")) {
                break;
            }

            int amount = Integer.parseInt(parts[1]);

            // Practically says we don't consider negative amount
            if (amount < 0) {
                amount = 0;
            }

            switch (command) {
                case "add" -> {
                    // Add amount to variable first
                    /*
                        Rules
                        1. Cannot exceed 100
                        2. If amount being added exceeds 100, the value stays at 100
                     */
                    first += amount;
                    if (first > 100) {
                        first = 100;
                    }
                }
                case "move" -> {
                    // Move amount from variable first to variable second
                    /*
                        Rules
                        1. Cannot exceed 100
                        2. If amount being moved exceeds 100, the value stays at 100
                        3. Rule of thumb: first is subtracted, and second is added
                     */
                    if (first - amount < 0) {
                        second += first;
                        first = 0;
                    } else {
                        first -= amount;
                        second += amount;
                    }

                    if (second > 100) {
                        second = 100;
                    }
                }
                case "remove" -> {
                    // Remove amount from variable second
                    /*
                        Rules
                        1. Cannot be fewer than 0
                        2. If amount being removed exceeds variable second value, the value stays at 0
                     */
                    second -= amount;
                    if (second < 0) {
                        second = 0;
                    }
                }
            }
        }
    }
}
