package andfxx.p6.separatinguifromlogic.simpledictionary;

import java.util.Scanner;

public class SimpleDictionaryTextUi {
    private final Scanner scanner;
    private final SimpleDictionary simpleDictionary;

    public SimpleDictionaryTextUi(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        System.out.println("Starting andfxx.p6.separatinguifromlogic.simpledictionary...");

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(new Translation(word, translation));
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();
                System.out.println("Translation: " + simpleDictionary.translate(word));
            } else {
                System.out.println("Unknown command.");
            }
        }
    }
}
