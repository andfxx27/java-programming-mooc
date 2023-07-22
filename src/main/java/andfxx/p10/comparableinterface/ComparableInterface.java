package andfxx.p10.comparableinterface;

import andfxx.p10.comparableinterface.compareto.Person;
import andfxx.p10.comparableinterface.literacycomparison.RawLiteracyDatum;
import andfxx.p10.comparableinterface.literature.Book;
import andfxx.p10.comparableinterface.studentsonalphabeticalorder.Student;
import andfxx.p10.comparableinterface.wageorder.Human;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class ComparableInterface {
    public static void comparableInterface() {
        System.out.println("Hello world from andfxx.p10.comparableinterface");

        literature();
    }

    private static void literature() {
        Scanner scanner = new Scanner(System.in);

        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if (bookName.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int bookAgeRecommendation = Integer.parseInt(scanner.nextLine());
            books.add(new Book(bookName, bookAgeRecommendation));
        }

        Comparator<Book> bookComparator = Comparator.comparing(Book::ageRecommendation).thenComparing(Book::name);

        books.sort(bookComparator);

        System.out.println(books.size() + " book(s) in total.");

        System.out.println("Book(s):");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void literacyComparison() {
        List<RawLiteracyDatum> data = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("files/p10/literacy.csv"))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                String theme = parts[0].trim();
                String gender = parts[2].trim().split(" ")[0];
                String country = parts[3].trim();
                int year = Integer.parseInt(parts[4].trim());
                double literacyRate = Double.parseDouble(parts[5].trim());

                data.add(new RawLiteracyDatum(
                        theme,
                        null,
                        gender,
                        country,
                        year,
                        literacyRate
                ));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        Collections.sort(data);

        for (RawLiteracyDatum datum : data) {
            System.out.println(datum);
        }
    }

    private static void studentsOnAlphabeticalOrder() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Gojo"));
        students.add(new Student("Nobara"));
        students.add(new Student("Itadori"));
        students.add(new Student("Megumi"));

        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);
    }

    private static void wageOrder() {
        List<Human> humans = new ArrayList<>();

        humans.add(new Human("Felix", 1));
        humans.add(new Human("Alvin", 3));
        humans.add(new Human("Belobog", 5));
        humans.add(new Human("Seele", -1));

        System.out.println(humans);

        Collections.sort(humans);

        System.out.println(humans);
    }

    private static void compareToSortingDemo() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Sasuke", 172));
        people.add(new Person("Kakashi", 175));
        people.add(new Person("Naruto", 165));
        people.add(new Person("Sakura", 160));

        System.out.println(people);

        Collections.sort(people);

        System.out.println(people);
    }
}
