package andfxx.p4.oopintroductions;

public class OopIntroductions {
    public static void oopIntroductions() {
        System.out.println("Hello world from andfxx.p4.oopintroductions");

        yourFirstBankTransfer();
    }

    private static void yourFirstBankTransfer() {
        Account matthewsAccount = new Account("Matthews account", 1000.0);
        Account myAccount = new Account("My account", 0);

        // Simulate money transfer process
        matthewsAccount.withdraw(100.0);
        myAccount.deposit(100.0);

        System.out.println("Matthews account:");
        System.out.println(matthewsAccount);

        System.out.println("My account:");
        System.out.println(myAccount);
    }

    private static void yourFirstAccount() {
        Account account = new Account("Felix's account", 100.0);

        account.deposit(20.0);

        System.out.println("Current balance of felix's account is " + account.getAccountBalance());
    }
}
