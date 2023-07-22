package andfxx.p10.otherusefultechniques;

import andfxx.p10.otherusefultechniques.enumanditerator.Education;
import andfxx.p10.otherusefultechniques.enumanditerator.Employees;
import andfxx.p10.otherusefultechniques.enumanditerator.Person;
import andfxx.p10.otherusefultechniques.sortthemcards.Card;
import andfxx.p10.otherusefultechniques.sortthemcards.Hand;
import andfxx.p10.otherusefultechniques.sortthemcards.SortBySuit;
import andfxx.p10.otherusefultechniques.sortthemcards.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OtherUsefulTechniques {
    public static void otherUsefulTechniques() {
        System.out.println("Hello world from andfxx.p10.otherusefultechniques");

        sortThemCards();
    }

    private static void sortThemCards() {
        Hand hand = new Hand();

        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(4, Suit.SPADE));
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(7, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.sortBySuit();

        hand.print();
    }

    private static void enumAndIterator() {
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();
    }

    private static void regularExpressions() {
        if (timeOfDay()) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }

    private static boolean timeOfDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        return str.matches("[0-2][0-9]:[0-5][0-9]:[0-5][0-9]");
    }

    private static boolean allVowels() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        return str.matches("[aiueo]*");
    }

    private static boolean isDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String day = scanner.nextLine();

        return day.matches("(mon|tue|wed|thu|fri|sat|sun)");
    }

    private static void stringBuilderDemo() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Hello world!\n");
        stringBuilder.append("My name is Felix Andersen...\n");
        stringBuilder.append("I aspire to be a knowledgeable programmer.\n");

        System.out.println(stringBuilder);
    }
}
