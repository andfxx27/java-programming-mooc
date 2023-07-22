package andfxx.p10.comparableinterface.literature;

public record Book(String name, int ageRecommendation) implements Comparable<Book> {
    @Override
    public int compareTo(Book o) {
        return this.ageRecommendation - o.ageRecommendation;
    }

    @Override
    public String toString() {
        return name + " (recommended for " + ageRecommendation + " year-olds or older)";
    }
}
