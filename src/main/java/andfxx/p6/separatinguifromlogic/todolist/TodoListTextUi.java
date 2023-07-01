package andfxx.p6.separatinguifromlogic.todolist;

import java.util.Scanner;

public class TodoListTextUi {
    private final Scanner scanner;
    private final TodoList todoList;

    public TodoListTextUi(Scanner scanner, TodoList todoList) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        System.out.println("Starting andfxx.p6.separatinguifromlogic.todolist");

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }

            switch (command) {
                case "add" -> {
                    System.out.print("To add: ");
                    String todo = scanner.nextLine();
                    this.todoList.add(todo);
                }
                case "list" -> this.todoList.print();
                case "remove" -> {
                    System.out.print("Which one is removed? ");
                    int todoNumber = Integer.parseInt(scanner.nextLine());
                    this.todoList.remove(todoNumber);
                }
            }
        }
    }
}
