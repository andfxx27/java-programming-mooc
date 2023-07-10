package andfxx.p9.inheritance.warehousing;

import java.util.ArrayList;
import java.util.List;

public class ChangeHistory {
    private List<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history = new ArrayList<>();
    }

    public double maxValue() {
        double max = 0;
        for (double val : this.history) {
            if (val > max) {
                max = val;
            }
        }

        return max;
    }

    public double minValue() {
        if (this.history.size() == 0) {
            return 0;
        }

        double min = this.history.get(0);
        for (double val : this.history) {
            if (val < min) {
                min = val;
            }
        }

        return min;
    }

    public double average() {
        if (this.history.size() == 0) {
            return 0;
        }

        double sum = 0;
        for (double val : this.history) {
            sum += val;
        }

        return sum / this.history.size();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
}
