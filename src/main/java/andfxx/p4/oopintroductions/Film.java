package andfxx.p4.oopintroductions;

public class Film {
    private final String name;
    private final int ageRating;

    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }

    public String name() {
        return name;
    }

    public int ageRating() {
        return ageRating;
    }
}
