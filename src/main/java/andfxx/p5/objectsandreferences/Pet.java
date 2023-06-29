package andfxx.p5.objectsandreferences;

public class Pet {
    private final String name;
    private final String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}
