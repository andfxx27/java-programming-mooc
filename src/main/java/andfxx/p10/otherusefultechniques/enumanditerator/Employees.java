package andfxx.p10.otherusefultechniques.enumanditerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private final List<Person> people;

    public Employees() {
        this.people = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        if (!this.people.contains(personToAdd)) {
            this.people.add(personToAdd);
        }
    }

    public void add(List<Person> peopleToAdd) {
        List<Person> filteredPeopleToAdd = peopleToAdd.stream().filter(person -> !this.people.contains(person)).toList();
        this.people.addAll(filteredPeopleToAdd);
    }

    public void print() {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(iterator.next());
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
