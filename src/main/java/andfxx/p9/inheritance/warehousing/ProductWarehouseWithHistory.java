package andfxx.p9.inheritance.warehousing;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private final ChangeHistory history;

    public ProductWarehouseWithHistory(String name, double capacity, double balance) {
        super(name, capacity, balance);
        this.history = new ChangeHistory();
        this.history.add(balance);
    }

    public String history() {
        return history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double takenAmount = super.takeFromWarehouse(amount);
        this.history.add(getBalance());
        return takenAmount;
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
