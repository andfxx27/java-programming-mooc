package andfxx.p5.objectsandreferences;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    private Pet pet;
    private SimpleDate birthday;

    public Person(String name, int age, int weight, int height) {
        this(name, age, weight, height, new Pet("Shiro", "Shiba Inu"));
    }

    public Person(String name, int age, int weight, int height, Pet pet) {
        this(name, age, weight, height, pet, new SimpleDate(1, 1, 1970));
    }

    public Person(String name, int age, int weight, int height, Pet pet, SimpleDate birthday) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.pet = pet;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return name + ", has a friend called " + pet.getName() + " (" + pet.getBreed() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Person comparedPerson)) {
            return false;
        }

        return this.name.equals(comparedPerson.name) && this.age == comparedPerson.age && this.weight == comparedPerson.weight && this.height == comparedPerson.height && this.birthday.equals(comparedPerson.birthday);
    }
}
