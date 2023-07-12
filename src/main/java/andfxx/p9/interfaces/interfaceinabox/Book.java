package andfxx.p9.interfaces.interfaceinabox;

public class Book implements Packable {
    private final String author;
    private final String name;
    private final double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return author + ": " + name;
    }
}
