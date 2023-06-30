package andfxx.p6.objectswithinobjects;

public class ObjectsWithinObjects {
    public static void objectsWithinObjects() {
        System.out.println("Hello world from andfxx.p6.objectswithinobjects");

        cargoHold();
    }

    private static void cargoHold() {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }

    private static void heightOrder() {
        Room room = new Room();

        System.out.println("Empty room? " + room.isEmpty());

        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        System.out.println("Empty room? " + room.isEmpty());

        for (Person person : room.getPeople()) {
            System.out.println(person);
        }

        System.out.println("Shortest: " + room.take());

        for (Person person : room.getPeople()) {
            System.out.println(person);
        }
    }

    private static void longestInCollection() {
        SimpleCollection chars = new SimpleCollection("characters");

        System.out.println("Longest: " + chars.longest());

        chars.add("Spongebob");
        chars.add("Patrick");
        chars.add("Squidward T.");

        System.out.println("Longest: " + chars.longest());
    }

    private static void santaWorkshop() {
        Gift book = new Gift("Naruto", 1);

        System.out.println(book);

        Package pkg = new Package();
        pkg.addGift(book);

        System.out.println(pkg.totalWeight());
    }

    private static void printingACollection() {
        SimpleCollection s = new SimpleCollection("alphabet");

        System.out.println(s);

        s.add("a");

        System.out.println(s);

        s.add("b");

        System.out.println(s);

        s.add("c");

        System.out.println(s);
    }

    private static void messagingService() {
        MessagingService messagingService = new MessagingService();

        messagingService.addMessage(new Message("Felix", "What is your favorite game?"));
        messagingService.addMessage(new Message("Owen", "My favorite game is Yakuza!"));
        messagingService.addMessage(new Message("Felix", "Wow cool! Me 2 hehe..."));

        System.out.println(messagingService.getMessages());
    }

    private static void stack() {
        MyStack myStack = new MyStack();
        myStack.add("1");
        myStack.add("2");
        myStack.add("3");
        myStack.add("4");
        myStack.add("5");

        while (!myStack.isEmpty()) {
            System.out.println(myStack.take());
        }
    }

    private static void menu() {
        Menu menu = new Menu();
        menu.addMeal("Chicken Steak Cheesy");
        menu.addMeal("Chicken Noodle");
        menu.addMeal("Satay");

        menu.printMeals();

        menu.clearMenu();

        menu.addMeal("Cap cay");

        System.out.println("---");

        menu.printMeals();
    }
}
