package andfxx.p11.processingfiles;

import andfxx.p11.processingfiles.savabledictionary.SavableDictionary;

public class ProcessingFiles {
    public static void processingFiles() {
        System.out.println("Hello world from andfxx.p11.processingfiles");

        savableDictionary();
    }

    private static void savableDictionary() {
        SavableDictionary dictionary = new SavableDictionary("files/p11/words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("words"));

        dictionary.add("Hello", "Halo");

        dictionary.delete("life");

        dictionary.save();
    }
}
