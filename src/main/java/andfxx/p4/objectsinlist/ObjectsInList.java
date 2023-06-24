package andfxx.p4.objectsinlist;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectsInList {
    static Scanner scanner = new Scanner(System.in);

    public static void objectsInList() {
        System.out.println("Hello world from andfxx.p4.objectsinlist");

        book();
    }

    private static void book() {
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        System.out.print("What information to be printed? ");
        String query = scanner.nextLine();
        if (query.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (query.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }

    private static void televisionProgram() {
        List<TelevisionProgram> programs = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());

            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }
    }

    private static void personalInformation() {
        List<PersonalInformation> personalInformationList = new ArrayList<>();

        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Identification number: ");
            String identificationNumber = scanner.nextLine();

            personalInformationList.add(new PersonalInformation(firstName, lastName, identificationNumber));
        }

        for (PersonalInformation personalInformation : personalInformationList) {
            System.out.println(personalInformation);
        }
    }

    private static void items() {
        List<Item> items = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String itemName = scanner.nextLine();
            if (itemName.isEmpty()) {
                break;
            }

            LocalDateTime now = LocalDateTime.now();
            int dayOfMonth = now.getDayOfMonth();
            int monthOfYear = now.getMonthValue();
            int year = now.getYear();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            String dateString = String.format("%d.%s.%d %d:%d:%d", dayOfMonth, formatSingleDigitNumber(monthOfYear), year, hour, minute, second);
            items.add(new Item(itemName, dateString));
        }

        for (Item item : items) {
            System.out.println(item);
        }
    }

    private static String formatSingleDigitNumber(int number) {
        if (number < 10) {
            return String.format("0%d", number);
        }

        return Integer.toString(number);
    }
}
