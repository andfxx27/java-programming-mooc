package andfxx.p5.methodandconstructoroverloading;

public class Counter {
    private int value;

    public Counter() {
        this(0);
    }

    public Counter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void increase(int value) {
        if (value < 0) {
            return;
        }

        this.value += value;
    }

    public void decrease() {
        value--;
    }

    public void decrease(int value) {
        if (value < 0) {
            return;
        }

        this.value -= value;
    }

    @Override
    public String toString() {
        return "Current counter value is " + value;
    }
}
