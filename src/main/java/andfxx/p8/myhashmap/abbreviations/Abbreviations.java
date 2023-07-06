package andfxx.p8.myhashmap.abbreviations;

import java.util.HashMap;
import java.util.Map;

public class Abbreviations {
    private final Map<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    private static String sanitizeString(String string) {
        string = string.toLowerCase().trim();
        return string;
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        String sanitizedAbbreviation = sanitizeString(abbreviation);

        if (this.abbreviations.containsKey(sanitizedAbbreviation)) {
            System.out.println("This abbreviation is already added.");
        } else {
            this.abbreviations.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(sanitizeString(abbreviation));
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(sanitizeString(abbreviation));
    }
}
