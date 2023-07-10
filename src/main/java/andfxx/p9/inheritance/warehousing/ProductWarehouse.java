package andfxx.p9.inheritance.warehousing;

public class ProductWarehouse extends Warehouse {
    private String name;

    public ProductWarehouse(String name, double capacity, double balance) {
        super(capacity, balance);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": " + super.toString();
    }
}
