package andfxx.p4.objectsinlist;

public class Book {
    private final String title;
    private final int pages;
    private final int publicationYear;

    public String getTitle() {
        return title;
    }

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
