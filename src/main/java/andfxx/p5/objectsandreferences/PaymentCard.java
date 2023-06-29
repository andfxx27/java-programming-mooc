package andfxx.p5.objectsandreferences;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double balance) {
        this.balance += balance;
    }

    public boolean takeMoney(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        }

        return false;
    }
}
