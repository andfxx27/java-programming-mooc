package andfxx.p10.comparableinterface;

import andfxx.p10.comparableinterface.compareto.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {
    public static void comparableInterface() {
        System.out.println("Hello world from andfxx.p10.comparableinterface");

        compareToSortingDemo();
    }

    private static void compareToSortingDemo() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Sasuke", 172));
        people.add(new Person("Kakashi", 175));
        people.add(new Person("Naruto", 165));
        people.add(new Person("Sakura", 160));

        System.out.println(people);

        Collections.sort(people);

        System.out.println(people);
    }
}
