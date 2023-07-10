package andfxx.p9.inheritance.differentkindofboxes;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private final ArrayList<Item> items;
    private final int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    protected int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    @Override
    public void add(Item item) {
        if (totalWeight() + item.getWeight() <= this.capacity) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
