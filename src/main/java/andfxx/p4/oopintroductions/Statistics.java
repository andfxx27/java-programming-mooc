package andfxx.p4.oopintroductions;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
    }

    public int getCount() {
        return this.count;
    }

    public void addNumber(int number) {
        this.sum += number;
        this.count++;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return (1.0 * this.sum / this.count);
    }
}
