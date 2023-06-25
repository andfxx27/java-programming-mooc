package andfxx.p4.filesandreadingdata;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> people = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file));) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                people.add(new Person(name, age));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return people;
    }

    @Override
    public String toString() {
        return "{" + this.name + ", " + this.age + "}";
    }
}
