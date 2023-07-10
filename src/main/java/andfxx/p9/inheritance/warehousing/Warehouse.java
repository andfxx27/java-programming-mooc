package andfxx.p9.inheritance.warehousing;

public class Warehouse {
    private double balance;
    private double capacity;

    public Warehouse(double capacity, double balance) {
        this.capacity = capacity;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchSpaceLeft() {
        return capacity - balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }

        if (howMuchSpaceLeft() - amount < 0) {
            balance = capacity;
            return;
        }

        balance += amount;
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0;
        }

        if (balance - amount < 0) {
            double takenAmount = balance;
            balance = 0;
            return takenAmount;
        }

        balance -= amount;
        return amount;
    }

    @Override
    public String toString() {
        return "balance = " + balance + ", space left " + howMuchSpaceLeft();
    }
}
