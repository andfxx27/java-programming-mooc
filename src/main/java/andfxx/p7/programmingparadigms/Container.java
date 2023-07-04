package andfxx.p7.programmingparadigms;

public class Container {
    private int value;
    private int containerLimit = 100;

    public Container() {
        this.value = 0;
    }

    public int contains() {
        return this.value;
    }

    public void add(int amount) {
        if (amount < 0) {
            amount = 0;
        }

        this.value += amount;
        if (this.value > this.containerLimit) {
            this.value = this.containerLimit;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            amount = 0;
        }

        this.value -= amount;
        if (this.value < 0) {
            this.value = 0;
        }
    }

    @Override
    public String toString() {
        return this.value + "/" + this.containerLimit;
    }
}
