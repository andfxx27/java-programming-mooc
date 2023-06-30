package andfxx.p6.objectswithinobjects;

import java.util.ArrayList;
import java.util.List;

public class Hold {
    private final List<Suitcase> suitcases;
    private final int maxWeight;

    public Hold(int maxWeight) {
        suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        if (suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        if (suitcases.size() == 1) {
            return "1 suitcase (" + totalWeight() + " kg)";
        }

        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

    private int totalWeight() {
        int weight = 0;
        for (Suitcase suitcase : suitcases) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
