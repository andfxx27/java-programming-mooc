package andfxx.p5.objectsandreferences;

public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.5) {
            affordableMeals++;
            money += 2.5;
            return payment - 2.5;
        }

        return payment;
    }

    public boolean eatAffordably(PaymentCard paymentCard) {
        if (paymentCard.getBalance() - 2.5 >= 0) {
            affordableMeals++;
            paymentCard.takeMoney(2.5);
            return true;
        }

        return false;
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.3) {
            heartyMeals++;
            money += 4.3;
            return payment - 4.3;
        }

        return payment;
    }

    public boolean eatHeartily(PaymentCard paymentCard) {
        if (paymentCard.getBalance() - 4.3 >= 0) {
            heartyMeals++;
            paymentCard.takeMoney(4.3);
            return true;
        }

        return false;
    }

    public void addMoneyToCard(PaymentCard paymentCard, double sum) {
        money += sum;
        paymentCard.addMoney(sum);
    }

    @Override
    public String toString() {
        return "Money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
