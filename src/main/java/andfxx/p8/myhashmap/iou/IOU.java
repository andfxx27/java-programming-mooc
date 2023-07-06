package andfxx.p8.myhashmap.iou;

import java.util.HashMap;
import java.util.Map;

public class IOU {
    private final Map<String, Double> debts;

    public IOU() {
        this.debts = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.debts.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.debts.getOrDefault(toWhom, 0.0);
    }
}
