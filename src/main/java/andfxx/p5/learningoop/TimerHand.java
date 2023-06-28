package andfxx.p5.learningoop;

public class TimerHand {
    private int value;
    private final int limit;

    public TimerHand(int value, int limit) {
        this.value = value;
        this.limit = limit;
    }

    public int getValue() {
        return value;
    }

    public void advance() {
        value++;

        if (value >= limit) {
            value = 0;
        }
    }

    @Override
    public String toString() {
        if (value < 10) {
            return "0" + value;
        }

        return Integer.toString(value);
    }
}
