package andfxx.p5.objectsandreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectsAndReferences {
    static Scanner scanner = new Scanner(System.in);

    public static void objectsAndReferences() {
        System.out.println("Hello world from andfxx.p5.objectsandreferences");

        money();
    }

    private static void money() {
        Money a = new Money(10, 0);
        Money b = new Money(5, 0);

        Money c = a.plus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = a.plus(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("===");

        a = new Money(10, 0);
        b = new Money(3, 0);
        c = new Money(5, 0);

        System.out.println(a.lessThan(b));
        System.out.println(b.lessThan(c));

        System.out.println("===");

        a = new Money(10, 0);
        b = new Money(3, 50);

        c = a.minus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        c = c.minus(a);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    private static void datingApp() {
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is: " + date);

        SimpleDate newDate = date.afterNumberOfDays(7);

        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
            week++;
        }

        System.out.println(date.afterNumberOfDays(790));
    }

    private static void archive() {
        List<ArchiveItem> archiveItems = new ArrayList<>();

        while (true) {
            System.out.println("Identifier (empty will stop):");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            ArchiveItem archiveItem = new ArchiveItem(identifier, name);
            if (!archiveItems.contains(archiveItem)) {
                archiveItems.add(archiveItem);
            }
        }

        System.out.println("==Items==");
        for (ArchiveItem archiveItem : archiveItems) {
            System.out.println(archiveItem);
        }
    }

    private static void books() {
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, publicationYear);
            if (books.contains(book)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
                continue;
            }

            books.add(book);
        }

        System.out.println("Thank you! Books added: " + books.size());
    }

    private static void identicalTwins() {
        Person leo = new Person("Leo", 9, 35, 134, new Pet("Shiro", "Shiba Inu"), new SimpleDate(12, 5, 2000));
        Person anotherLeo = new Person("Leo", 10, 35, 134, new Pet("Shiro", "Shiba Inu"), new SimpleDate(12, 5, 2000));

        if (leo.equals(anotherLeo)) {
            System.out.println("These are the same person.");
        } else {
            System.out.println("These are not the same person.");
        }
    }

    private static void song() {
        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }
    }

    private static void comparingApartments() {
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));

        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));

        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));
    }

    private static void biggestPetShop() {
        Person person = new Person("Felix Andersen", 23, 68, 172, new Pet("Shiro", "Shiba Inu"));

        System.out.println(person);
    }

    private static void cardPaymentsP4() {
        PaymentTerminal binusCanteen = new PaymentTerminal();
        System.out.println(binusCanteen);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("Amount of money on the card is " + annesCard.getBalance() + " euros");

        boolean isSuccessPurchase = binusCanteen.eatHeartily(annesCard);
        System.out.println("There was enough money: " + isSuccessPurchase);

        binusCanteen.addMoneyToCard(annesCard, 100);

        isSuccessPurchase = binusCanteen.eatHeartily(annesCard);
        System.out.println("There was enough money: " + isSuccessPurchase);

        System.out.println("Amount of money on the card is " + annesCard.getBalance() + " euros");

        System.out.println(binusCanteen);
    }

    private static void cardPaymentsP3() {
        PaymentTerminal binusCanteen = new PaymentTerminal();

        double change = binusCanteen.eatAffordably(10);
        System.out.println("Remaining change: " + change);

        PaymentCard annesCard = new PaymentCard(7);

        boolean isSuccessPurchase = binusCanteen.eatHeartily(annesCard);
        System.out.println("There was enough money: " + isSuccessPurchase);
        isSuccessPurchase = binusCanteen.eatHeartily(annesCard);
        System.out.println("There was enough money: " + isSuccessPurchase);
        isSuccessPurchase = binusCanteen.eatAffordably(annesCard);
        System.out.println("There was enough money: " + isSuccessPurchase);

        System.out.println(binusCanteen);
    }

    private static void cardPaymentsP2() {
        PaymentTerminal binusCanteen = new PaymentTerminal();

        double change = binusCanteen.eatAffordably(10);
        System.out.println("Remaining change: " + change);

        change = binusCanteen.eatAffordably(5);
        System.out.println("Remaining change: " + change);

        change = binusCanteen.eatHeartily(5);
        System.out.println("Remaining change: " + change);

        System.out.println(binusCanteen);
    }

    private static void cardPaymentsP1() {
        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("Money: " + petesCard.getBalance());
        boolean isSuccessWithdraw = petesCard.takeMoney(8);
        System.out.println("Successfully withdrew: " + isSuccessWithdraw);
        System.out.println("Money: " + petesCard.getBalance());

        isSuccessWithdraw = petesCard.takeMoney(4);
        System.out.println("Successfully withdrew: " + isSuccessWithdraw);
        System.out.println("Money: " + petesCard.getBalance());
    }

    private static void healthStation() {
        Person person1 = new Person("Felix Andersen", 23, 68, 172);
        Person person2 = new Person("Seele", 20, 45, 162);

        HealthStation healthStation = new HealthStation();

        System.out.println("weighings performed: " + healthStation.weighings());

        System.out.println(person1.getName() + "'s weight: " + healthStation.weigh(person1) + " kilo(s)");
        System.out.println(person2.getName() + "'s weight: " + healthStation.weigh(person2) + " kilo(s)");

        System.out.println("weighings performed: " + healthStation.weighings());

        healthStation.feed(person1);
        healthStation.feed(person1);

        System.out.println(person1.getName() + "'s weight: " + healthStation.weigh(person1) + " kilo(s)");
        System.out.println(person2.getName() + "'s weight: " + healthStation.weigh(person2) + " kilo(s)");

        System.out.println("weighings performed: " + healthStation.weighings());
    }

    private static void nullPointerException() {
        String name = null;

        // Invoke method on a null variable to trigger NullPointerException
        System.out.println("Length of name is " + name.length() + " character(s)");
    }
}
