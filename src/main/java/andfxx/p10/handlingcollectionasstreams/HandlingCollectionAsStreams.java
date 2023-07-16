package andfxx.p10.handlingcollectionasstreams;

import andfxx.p10.handlingcollectionasstreams.uniquelastnames.Person;
import andfxx.p7.algorithms.Book;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HandlingCollectionAsStreams {
    static Scanner globalScanner = new Scanner(System.in);

    public static void handlingCollectionAsStreams() {
        System.out.println("Hello world from andfxx.p10.handlingcollectionasstreams");

        booksFromFile();
    }

    private static void booksFromFile() {
        String filePath = "files/p10/books.txt";
        try {
            List<Book> books = readBooks(filePath);
            System.out.println(books);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static List<Book> readBooks(String filePath) throws IOException {
        try (Stream<Book> bookStream = Files
                .lines(Paths.get(filePath))
                .map(s -> s.split(","))
                .filter(strings -> strings.length == 2)
                .map(strings -> new Book(Integer.parseInt(strings[0]), strings[1]))) {
            return bookStream.toList();
        } catch (IOException exception) {
            return null;
        }
    }

    private static void readingFilesPerLine() {
        String filePath = "files/p10/file.txt";
        try {
            List<String> lines = read(filePath);
            System.out.println(lines);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static List<String> read(String filePath) throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            return stream.toList();
        } catch (IOException exception) {
            return null;
        }
    }

    private static void weighting() {
        System.out.println("Changes is done on p6.objectswithinobjects.cargoHold() method.");
    }

    private static void uniqueLastNames() {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            String initialCommand = scanner.nextLine();
            if (initialCommand.equals("quit")) {
                break;
            }

            System.out.print("Input first name: ");
            String firstname = scanner.nextLine();

            System.out.print("Input last name: ");
            String lastname = scanner.nextLine();

            System.out.print("Input the year of birth: ");
            int birthYear = Integer.parseInt(scanner.nextLine());

            people.add(new Person(firstname, lastname, birthYear));
        }

        List<String> uniqueLastNames = people.stream().map(Person::lastname).distinct().sorted().toList();

        for (String name : uniqueLastNames) {
            System.out.println(name);
        }
    }

    private static void limitedNumbers() {
        List<String> numbers = readStrings();

        numbers.stream().mapToInt(Integer::parseInt).filter(value -> value >= 1 && value <= 5).forEach(System.out::println);
    }

    private static void printingUserInput() {
        List<String> strings = readStrings();

        strings.stream().forEach(System.out::println);
    }

    private static void reduceDemo1() {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(7);
        values.add(3);
        values.add(2);
        values.add(1);

        int sum = values.stream().reduce(0, Integer::sum);

        System.out.println(sum);
    }

    private static void divisible() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible
                .forEach(System.out::println);
    }

    private static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        return numbers.stream().filter(integer -> integer % 2 == 0 || integer % 3 == 0 || integer % 5 == 0).collect(Collectors.toCollection(ArrayList::new));
    }

    private static void positiveNumbers() {
        List<String> list = new ArrayList<>(List.of("1", "-22", "3", "-6", "9", "-11", "14"));

        List<Integer> positiveNumbers = list
                .stream()
                .mapToInt(Integer::parseInt)
                .filter(value -> value > 0)
                .boxed()
                .toList();

        System.out.println(positiveNumbers);
    }

    private static void averageOfSelectedNumbers() {
        List<String> numbers = readStrings();

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        IntPredicate filterPredicate;
        String message;

        String choice = globalScanner.nextLine();
        if (choice.equals("n")) {
            filterPredicate = value -> value < 0;
            message = "Average of the negative numbers: ";
        } else {
            filterPredicate = value -> value > 0;
            message = "Average of the positive numbers: ";
        }

        double average = numbers
                .stream()
                .mapToInt(Integer::parseInt) // This reads as "Use parseInt static method from class Integer"
                .filter(filterPredicate)
                .average()
                .getAsDouble();

        System.out.println(message + average);
    }

    private static void averageOfNumbers() {
        List<String> numbers = readStrings();

        OptionalDouble optionalDoubleAverage = numbers.stream().mapToInt(Integer::parseInt).average();
        if (optionalDoubleAverage.isPresent()) {
            double average = optionalDoubleAverage.getAsDouble();
            System.out.println("Average of the numbers: " + average);
        }
    }

    private static List<String> readStrings() {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            numbers.add(input);
        }

        return numbers;
    }

    private static void streamsDemo1() {
        List<String> list = new ArrayList<>(List.of("1", "2", "3", "6", "9", "11", "14"));

        // Count the number of values divisible by 3 in list
        long count = list
                .stream()
                .mapToInt(Integer::parseInt)
                .filter(value -> value % 3 == 0)
                .count();

        double average = list.stream().mapToInt(Integer::parseInt).average().getAsDouble();

        System.out.println(count);
        System.out.println(average);
    }
}
