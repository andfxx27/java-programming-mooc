package andfxx.p9.inheritance;

import andfxx.p9.inheritance.abc.A;
import andfxx.p9.inheritance.abc.B;
import andfxx.p9.inheritance.abc.C;
import andfxx.p9.inheritance.differentkindofboxes.Item;
import andfxx.p9.inheritance.differentkindofboxes.MisplacingBox;
import andfxx.p9.inheritance.personandsubclasses.Person;
import andfxx.p9.inheritance.personandsubclasses.Student;
import andfxx.p9.inheritance.quiz1.Counter;
import andfxx.p9.inheritance.quiz1.SuperCounter;
import andfxx.p9.inheritance.warehousing.ProductWarehouseWithHistory;

public class Inheritance {
    public static void inheritance() {
        System.out.println("Hello world from andfxx.p9.inheritance");

        differentKindOfBoxes();
    }

    private static void differentKindOfBoxes() {
        MisplacingBox box = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
    }

    private static void warehousing() {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);

        juice.printAnalysis();
    }

    private static void quiz1Inheritance() {
        Counter counter = new Counter();
        Counter superCounter = new SuperCounter();

        int number = 3;

        number = superCounter.subtractFromNumber(number); // 2
        System.out.println(number);

        number = superCounter.subtractFromNumber(number); // 1
        System.out.println(number);

        number = counter.addToNumber(number);
        System.out.println(number);
    }

    private static void personAndSubclasses() {
        // Actual type is type after "new" keyword
        // Method to be executed (in this case toString) is chosen based on the actual type
        // Example below will print using Student's toString method

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        Person olliePerson = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(olliePerson);
        Object ollieObject = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollieObject);

        Object alice = new Student("Alice", "177 Stewart Ave. Farmington, ME 04938");
        System.out.println(alice);
    }

    private static void abc() {
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();

        System.out.println("--Test inheritance--");
        System.out.println("Base class: " + a.getClass());
        System.out.println(b.getClass() + " extends " + a.getClass());
        System.out.println(c.getClass() + " extends " + b.getClass());

        c.a();
        c.b();
        c.c();
    }
}
