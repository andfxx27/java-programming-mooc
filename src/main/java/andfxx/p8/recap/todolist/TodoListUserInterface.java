package andfxx.p8.recap.todolist;

import java.util.List;
import java.util.Scanner;

public class TodoListUserInterface {
    private final Scanner scanner;
    private final TodoList todoList;

    public TodoListUserInterface(Scanner scanner, TodoList todoList) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            switch (command) {
                case "add" -> {
                    System.out.print("To add: ");
                    this.todoList.add(this.scanner.nextLine());
                }
                case "list" -> {
                    this.todoList.print();
                }
                case "remove" -> {
                    System.out.print("Which one is removed? ");
                    int number = Integer.parseInt(scanner.nextLine());
                    this.todoList.remove(number);
                }
            }
        }
    }
}
