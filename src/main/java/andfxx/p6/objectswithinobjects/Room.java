package andfxx.p6.objectswithinobjects;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private final List<Person> people;

    public Room() {
        people = new ArrayList<>();
    }

    public void add(Person person) {
        people.add(person);
    }

    public boolean isEmpty() {
        return people.isEmpty();
    }

    public ArrayList<Person> getPeople() {
        return (ArrayList<Person>) people;
    }

    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }

        Person person = people.get(0);

        for (Person p : people) {
            if (p.getHeight() < person.getHeight()) {
                person = p;
            }
        }

        return person;
    }

    public Person take() {
        Person shortest = shortest();

        people.remove(shortest);

        return shortest;
    }
}
