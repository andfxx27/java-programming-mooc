package andfxx.p6.separatinguifromlogic.jokemanager;

import java.util.Scanner;

public class JokeManagerTextUi {
    private final Scanner scanner;
    private final JokeManager jokeManager;

    public JokeManagerTextUi(Scanner scanner, JokeManager jokeManager) {
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }

            switch (command) {
                case "1" -> {
                    System.out.println("Write the joke to be added:");
                    String joke = scanner.nextLine();
                    this.jokeManager.addJoke(joke);
                }
                case "2" -> {
                    System.out.println("Drawing a joke.");
                    System.out.println(this.jokeManager.drawJoke());
                }
                case "3" -> {
                    System.out.println("Printing the jokes.");
                    this.jokeManager.printJokes();
                }
            }
        }
    }
}
