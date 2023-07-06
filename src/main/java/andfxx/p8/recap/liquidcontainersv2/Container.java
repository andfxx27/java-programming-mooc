package andfxx.p8.recap.liquidcontainersv2;

public class Container {
    private int amount;
    private final int amountLimit = 100;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.amount += amount;
            if (this.amount > this.amountLimit) {
                this.amount = this.amountLimit;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.amount -= amount;
            if (this.amount < 0) {
                this.amount = 0;
            }
        }
    }

    @Override
    public String toString() {
        return this.amount + "/" + this.amountLimit;
    }
}
