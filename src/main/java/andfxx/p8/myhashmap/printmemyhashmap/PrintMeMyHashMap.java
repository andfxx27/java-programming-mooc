package andfxx.p8.myhashmap.printmemyhashmap;

import java.util.Map;

public class PrintMeMyHashMap {
    private static String sanitizeString(String string) {
        string = string.toLowerCase().trim();
        return string;
    }

    public static void printKeys(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(Map<String, String> map, String text) {
        String sanitizedText = sanitizeString(text);
        for (String key : map.keySet()) {
            if (key.contains(sanitizedText)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(Map<String, String> map, String text) {
        String sanitizedText = sanitizeString(text);
        for (String key : map.keySet()) {
            if (key.contains(sanitizedText)) {
                System.out.println(map.get(key));
            }
        }
    }
}
