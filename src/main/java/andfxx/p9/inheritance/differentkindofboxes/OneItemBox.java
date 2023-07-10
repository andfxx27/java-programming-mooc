package andfxx.p9.inheritance.differentkindofboxes;

import java.util.ArrayList;

public class OneItemBox extends Box {
    private final ArrayList<Item> items;

    public OneItemBox() {
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int capacity = 1;
        if (this.items.size() < capacity) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
