package andfxx.p6.separatinguifromlogic.simpledictionary;

public class Translation {
    private String word;
    private String translation;

    public Translation(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Translation t)) {
            return false;
        }

        return this.word.equals(t.word) && this.translation.equals(t.translation);
    }
}
