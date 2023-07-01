package andfxx.p6.separatinguifromlogic.simpledictionary;

import java.util.ArrayList;
import java.util.List;

public class SimpleDictionary {
    List<Translation> translations;

    public SimpleDictionary() {
        this.translations = new ArrayList<>();
    }

    public void add(Translation translation) {
        if (!this.translations.contains(translation)) {
            this.translations.add(translation);
        }
    }

    public String translate(String word) {
        for (Translation tr : this.translations) {
            if (tr.getWord().equals(word)) {
                return tr.getTranslation();
            }
        }

        return "Word " + word + " was not found.";
    }
}
