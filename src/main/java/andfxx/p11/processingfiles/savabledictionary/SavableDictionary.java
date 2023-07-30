package andfxx.p11.processingfiles.savabledictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SavableDictionary {
    private final Map<String, String> enToIdDictionary;
    private final Map<String, String> idToEnDictionary;
    private String file;

    public SavableDictionary() {
        this.enToIdDictionary = new HashMap<>();
        this.idToEnDictionary = new HashMap<>();
    }

    public SavableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                this.enToIdDictionary.putIfAbsent(parts[0], parts[1]);
                this.idToEnDictionary.putIfAbsent(parts[1], parts[0]);
            }

            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());

            return false;
        }
    }

    public boolean save() {
        try (PrintWriter printWriter = new PrintWriter(this.file)) {
            // Save to file

            for (String key : this.enToIdDictionary.keySet()) {
                printWriter.println(key + ":" + this.enToIdDictionary.get(key));
            }

            printWriter.close();

            return true;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

            return false;
        }
    }

    public void add(String words, String translation) {
        this.enToIdDictionary.putIfAbsent(words, translation);
        this.idToEnDictionary.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        if (this.enToIdDictionary.containsKey(word)) {
            return this.enToIdDictionary.get(word);
        }

        return this.idToEnDictionary.get(word);
    }

    public void delete(String word) {
        // words:kata
        String idTranslation = this.enToIdDictionary.get(word); // kata
        String enTranslation = this.idToEnDictionary.get(word); // null

        if (idTranslation != null) {
            this.enToIdDictionary.remove(word);
            this.idToEnDictionary.remove(idTranslation);
        } else {
            this.idToEnDictionary.remove(word);
            this.enToIdDictionary.remove(enTranslation);
        }
    }
}
