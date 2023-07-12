package andfxx.p9.interfaces.interfaceinabox;

import java.util.ArrayList;
import java.util.List;

public class Box implements Packable {
    private final double capacity;
    private final List<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable item : items) {
            totalWeight += item.weight();
        }

        return totalWeight;
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= capacity) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight: " + weight() + " kg";
    }
}
