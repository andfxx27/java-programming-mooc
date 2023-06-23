package andfxx.p4.oopintroductions;

public class OopIntroductions {
    public static void oopIntroductions() {
        System.out.println("Hello world from andfxx.p4.oopintroductions");

        film();
    }

    private static void film() {
        Film harryPotter = new Film("Harry Potter 3", 13);

        int currentAge = 13;

        if (currentAge > harryPotter.ageRating()) {
            System.out.println("You are allowed to watch harry potter!");
        } else {
            System.out.println("Just go watch roblox xD...");
        }
    }

    private static void song() {
        Song garden = new Song("In The Garden", 10910);
        System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
    }

    private static void debt() {
        Debt mortgage = new Debt(120000.0, 1.20);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
    }

    private static void decreasingCounter() {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }

    private static void product() {
        Product banana = new Product("Banana", 1.1, 13);

        banana.printProduct();
    }

    private static void door() {
        Door alexander = new Door();

        alexander.knock();
        alexander.knock();
    }

    private static void whistle() {
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
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
