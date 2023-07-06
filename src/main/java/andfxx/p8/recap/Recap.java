package andfxx.p8.recap;

import andfxx.p8.recap.liquidcontainersv2.Container;
import andfxx.p8.recap.todolist.TodoList;
import andfxx.p8.recap.todolist.TodoListUserInterface;

import java.util.Scanner;

public class Recap {
    public static void recap() {
        System.out.println("Hello world from andfxx.p8.recap");

        todoList();
    }

    private static void todoList() {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        TodoListUserInterface todoListUserInterface = new TodoListUserInterface(scanner, todoList);

        todoListUserInterface.start();
    }

    private static void liquidContainersV2() {
        Container first = new Container();
        Container second = new Container();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String[] commandParts = scanner.nextLine().split(" ");
            if (commandParts[0].equals("quit")) {
                break;
            }

            int amount = Integer.parseInt(commandParts[1]);

            if (amount < 0) {
                continue;
            }

            switch (commandParts[0]) {
                case "add" -> {
                    first.add(amount);
                }
                case "move" -> {
                    if (first.contains() - amount < 0) {
                        second.add(first.contains());
                        first.remove(amount);
                    } else {
                        first.remove(amount);
                        second.add(amount);
                    }
                }
                case "remove" -> {
                    second.remove(amount);
                }
            }
        }
    }

    private static void liquidContainers() {
        int first = 0;
        int second = 0;
        int containerLimit = 100;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + first + "/" + containerLimit);
            System.out.println("Second: " + second + "/" + containerLimit);

            String[] commandParts = scanner.nextLine().split(" ");
            if (commandParts[0].equals("quit")) {
                break;
            }

            int amount = Integer.parseInt(commandParts[1]);

            if (amount < 0) {
                continue;
            }

            switch (commandParts[0]) {
                case "add" -> {
                    first += amount;
                    if (first > containerLimit) {
                        first = containerLimit;
                    }
                }
                case "move" -> {
                    if (first - amount < 0) {
                        second += first;
                        first = 0;
                    } else {
                        first -= amount;
                        second += amount;
                    }

                    if (second > containerLimit) {
                        second = containerLimit;
                    }
                }
                case "remove" -> {
                    second -= amount;
                    if (second < 0) {
                        second = 0;
                    }
                }
            }
        }
    }

    private static void averageOfPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int value = Integer.parseInt(scanner.nextLine());
            if (value == 0) {
                break;
            }

            if (value > 0) {
                sum += value;
                count++;
            }
        }

        if (sum == 0) {
            System.out.println("Cannot calculate average.");
        } else {
            System.out.println(1.0 * sum / count);
        }
    }

    private static void cubes() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            int value = Integer.parseInt(input);
            System.out.println(value * value * value);
        }
    }
}
