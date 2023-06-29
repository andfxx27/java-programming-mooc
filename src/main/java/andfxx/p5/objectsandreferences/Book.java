package andfxx.p5.objectsandreferences;

public class Book {
    private final String title;
    private final int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Book book)) {
            return false;
        }

        return this.title.equals(book.title) && this.publicationYear == book.publicationYear;
    }
}
