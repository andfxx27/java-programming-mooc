package andfxx.p9.inheritance.differentkindofboxes;

import java.util.Objects;

public class Item {
    private final String name;
    private final int weight;

    public Item(String name) {
        this(name, 1);
    }

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Item item)) {
            return false;
        }

        return this.name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
