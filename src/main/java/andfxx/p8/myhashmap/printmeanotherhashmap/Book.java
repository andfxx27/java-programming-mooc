package andfxx.p8.myhashmap.printmeanotherhashmap;

public class Book {
    private final String name;
    private final int publicationYear;
    private final String synopsys;

    public Book(String name, int publicationYear, String synopsys) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.synopsys = synopsys;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getSynopsys() {
        return synopsys;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " (" + this.publicationYear + ")" + "\n" + "Contents: " + this.synopsys;
    }
}
