package andfxx.p12.typeparameters.pipe;

import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private final List<T> items;

    public Pipe() {
        this.items = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.items.add(value);
    }

    public T takeFromPipe() {
        if (this.items.isEmpty()) {
            return null;
        }

        T itemToTake = this.items.get(0);
        this.items.remove(itemToTake);
        return itemToTake;
    }

    public boolean isInPipe() {
        return !this.items.isEmpty();
    }
}
