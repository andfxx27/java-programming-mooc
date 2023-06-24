package andfxx.p4.objectsinlist;

public class Item {
    private final String name;
    private final String createdAt;

    public Item(String name, String createdAt) {
        this.name = name;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return this.name + " (created at: " + this.createdAt + ")";
    }
}
