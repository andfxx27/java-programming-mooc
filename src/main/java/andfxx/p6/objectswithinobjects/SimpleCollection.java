package andfxx.p6.objectswithinobjects;

import java.util.ArrayList;
import java.util.List;

public class SimpleCollection {
    private final String name;
    private final List<String> list;

    public SimpleCollection(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    public void add(String value) {
        list.add(value);
    }

    public String longest() {
        if (list.isEmpty()) {
            return null;
        }

        String value = list.get(0);

        for (String str : list) {
            if (str.length() > value.length()) {
                value = str;
            }
        }

        return value;
    }

    @Override
    public String toString() {
        if (list.size() == 0) {
            return "The collection " + name + " is empty.";
        }

        StringBuilder stringRepresentation = new StringBuilder("The collection " + name + " has " + list.size() + " element(s):");
        for (String value : list) {
            stringRepresentation.append("\n");
            stringRepresentation.append(value);
        }

        return stringRepresentation.toString();
    }
}
