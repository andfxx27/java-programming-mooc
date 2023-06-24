package andfxx.p4.oopintroductions;

import java.util.Scanner;

public class OopIntroductions {
    public static void oopIntroductions() {
        System.out.println("Hello world from andfxx.p4.oopintroductions");

        multipleCards();
    }

    private static void multipleCards() {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println("Paul's card: " + paulsCard);
        System.out.println("Matts's card: " + mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        System.out.println("Paul's card: " + paulsCard);
        System.out.println("Matts's card: " + mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        mattsCard.addMoney(50);

        System.out.println("Paul's card: " + paulsCard);
        System.out.println("Matts's card: " + mattsCard);
    }

    private static void paymentCard() {
        PaymentCard paymentCard = new PaymentCard(10);
        System.out.println(paymentCard);

        paymentCard.addMoney(5);
        System.out.println(paymentCard);

        paymentCard.addMoney(10);
        System.out.println(paymentCard);

        paymentCard.addMoney(-10);
        System.out.println(paymentCard);

        paymentCard.addMoney(200);
        System.out.println(paymentCard);
    }

    private static void multipleSums() {
        Scanner scanner = new Scanner(System.in);

        Statistics s1 = new Statistics();
        Statistics s2 = new Statistics();
        Statistics s3 = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }

            s1.addNumber(input);

            if (input % 2 == 0) {
                s2.addNumber(input);
            }

            if (input % 2 == 1) {
                s3.addNumber(input);
            }
        }

        System.out.println("Sum: " + s1.sum());
        System.out.println("Sum of even numbers: " + s2.sum());
        System.out.println("Sum of odd numbers: " + s3.sum());
    }

    private static void sumOfUserInput() {
        Scanner scanner = new Scanner(System.in);

        Statistics statistics = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }

            statistics.addNumber(input);
        }

        System.out.println("Sum: " + statistics.sum());
    }

    private static void statistics() {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }

    private static void multiplier() {
        Multiplier multiplyByThree = new Multiplier(3);

        System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));
        System.out.println("multiplyByThree.multiply(3): " + multiplyByThree.multiply(3));
    }

    private static void agent() {
        Agent bond = new Agent("James", "Bond");

        System.out.println(bond);
    }

    private static void gauge() {
        Gauge g = new Gauge();

        while (!g.full()) {
            System.out.println("Increasing gauge value, current gauge value: " + g.value());
            g.increase();
        }

        System.out.println("Gauge is full! current gauge value: " + g.value());

        System.out.println("Gauge usage, decrease value by 1.");
        g.decrease();
        System.out.println("Current gauge value: " + g.value());
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
