package andfxx.p8.myhashmap.printmeanotherhashmap;

import java.util.Map;

public class PrintMeAnotherHashMap {
    private static String sanitizeString(String string) {
        string = string.toLowerCase().trim();
        return string;
    }

    public static void printValues(Map<String, Book> map) {
        for (Book book : map.values()) {
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(Map<String, Book> map, String text) {
        String sanitizedText = sanitizeString(text);
        for (Book book : map.values()) {
            if (book.getName().contains(sanitizedText)) {
                System.out.println(book);
            }
        }
    }
}
