package andfxx.p5.methodandconstructoroverloading;

public class Product {
    private final String name;
    private final String location;
    private final int weight;

    public Product(String name) {
        this(name, "shelf", 1);
    }

    public Product(String name, String location) {
        this(name, location, 1);
    }

    public Product(String name, int weight) {
        this(name, "shelf", weight);
    }

    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg) can be found from the " + location;
    }
}
