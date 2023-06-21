package andfxx.p4.oopintroductions;

public class Account {
    private String accountDescription;
    private double accountBalance;

    public Account(String accountDescription, double accountBalance) {
        this.accountDescription = accountDescription;
        this.accountBalance = accountBalance;
    }

    public String getAccountDescription() {
        return accountDescription;
    }

    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void withdraw(double withdrawAmount) {
        if (accountBalance - withdrawAmount <= 0) {
            accountBalance = 0;
            return;
        }

        accountBalance -= withdrawAmount;
    }

    public void deposit(double depositAmount) {
        accountBalance += depositAmount;
    }

    public String toString() {
        return "Account " + accountDescription + " current balance is " + accountBalance;
    }
}
