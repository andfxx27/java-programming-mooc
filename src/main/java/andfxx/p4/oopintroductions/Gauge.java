package andfxx.p4.oopintroductions;

public class Gauge {
    private int value;

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        if (this.value + 1 <= 5) {
            this.value++;
        }
    }

    public void decrease() {
        if (this.value - 1 >= 0) {
            this.value--;
        }
    }

    public int value() {
        return value;
    }

    public boolean full() {
        return this.value == 5;
    }
}
