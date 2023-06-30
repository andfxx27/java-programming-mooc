package andfxx.p6.objectswithinobjects;

import java.util.ArrayList;
import java.util.List;

public class Package {
    private final List<Gift> gifts;

    public Package() {
        gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int weight = 0;
        for (Gift gift : gifts) {
            weight += gift.getWeight();
        }
        return weight;
    }
}
