package andfxx.p6.objectswithinobjects;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private final List<String> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(String value) {
        list.add(value);
    }

    public ArrayList<String> values() {
        return (ArrayList<String>) list;
    }

    public String take() {
        // Get reference to value on top of the stack if it is available
        int lastValueIndex = list.size() - 1;
        if (lastValueIndex >= 0) {
            String value = list.get(lastValueIndex);
            list.remove(lastValueIndex);
            return value;
        }

        // Return empty string for default value
        return "";
    }
}
