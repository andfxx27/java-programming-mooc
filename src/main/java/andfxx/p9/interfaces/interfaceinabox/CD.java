package andfxx.p9.interfaces.interfaceinabox;

public class CD implements Packable {
    private final String artist;
    private final String name;
    private final double weight;
    private final int publicationYear;

    public CD(String artist, String name, int publicationYear) {
        this.artist = artist;
        this.name = name;
        this.weight = 0.1;
        this.publicationYear = publicationYear;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return artist + ": " + name + " (" + publicationYear + ")";
    }
}
