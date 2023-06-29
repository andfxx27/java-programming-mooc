package andfxx.p5.objectsandreferences;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        int newMoneyEuros = euros + addition.euros;
        int newMoneyCents = cents + addition.cents;

        // Assume cents will never exceed 100
        if (newMoneyCents > 100) {
            newMoneyEuros++;
            newMoneyCents -= 100;
        }

        return new Money(newMoneyEuros, newMoneyCents);
    }

    public Money minus(Money decreaser) {
        int newMoneyEuros = euros - decreaser.euros;
        if (newMoneyEuros < 0) {
            return new Money(0, 0);
        }

        int newMoneyCents = cents - decreaser.cents;
        if (newMoneyCents < 0) {
            newMoneyEuros--;
            newMoneyCents = Math.abs(newMoneyCents);
        }

        return new Money(newMoneyEuros, newMoneyCents);
    }

    public boolean lessThan(Money compared) {
        if (euros < compared.euros) {
            return true;
        }

        if (euros > compared.euros) {
            return false;
        }

        return cents < compared.cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }
        return euros + "." + zero + cents + "e";
    }
}
