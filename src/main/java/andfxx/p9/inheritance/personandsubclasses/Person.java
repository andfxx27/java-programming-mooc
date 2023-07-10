package andfxx.p9.inheritance.personandsubclasses;

import java.util.ArrayList;

public class Person {
    private final String name;
    private final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name + "\n\t" + this.address;
    }

    public static void printPersons(ArrayList<Person> people) {
        for (Person person : people) {
            if (person instanceof Student student) {
                System.out.println(student);
            } else if (person instanceof Teacher teacher) {
                System.out.println(teacher);
            } else {
                System.out.println(person);
            }
        }
    }
}
