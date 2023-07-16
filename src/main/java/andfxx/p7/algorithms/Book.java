package andfxx.p7.algorithms;

public class Book {
    private final int id;
    private final String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + ", " + name;
    }
}
