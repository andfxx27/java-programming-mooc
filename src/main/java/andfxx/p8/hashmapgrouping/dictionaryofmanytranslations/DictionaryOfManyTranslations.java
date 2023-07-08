package andfxx.p8.hashmapgrouping.dictionaryofmanytranslations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryOfManyTranslations {
    private final Map<String, List<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        if (!this.dictionary.get(word).contains(translation)) {
            this.dictionary.get(word).add(translation);
        }
    }

    public ArrayList<String> translate(String word) {
        return (ArrayList<String>) this.dictionary.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
