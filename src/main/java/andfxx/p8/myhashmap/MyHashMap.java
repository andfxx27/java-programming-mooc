package andfxx.p8.myhashmap;

import andfxx.p8.myhashmap.abbreviations.Abbreviations;
import andfxx.p8.myhashmap.iou.IOU;
import andfxx.p8.myhashmap.printmeanotherhashmap.Book;
import andfxx.p8.myhashmap.printmeanotherhashmap.PrintMeAnotherHashMap;
import andfxx.p8.myhashmap.printmemyhashmap.PrintMeMyHashMap;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void myHashMap() {
        System.out.println("Hello world from andfxx.p8.myhashmap");

        iOweYou();
    }

    private static void iOweYou() {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Mike"));
    }

    private static void printMeAnotherHashMap() {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "..."));

        PrintMeAnotherHashMap.printValues(hashmap);
        System.out.println("---");
        PrintMeAnotherHashMap.printValueIfNameContains(hashmap, "prejud");
    }

    private static void printMeMyHashMap() {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        PrintMeMyHashMap.printKeys(hashmap);
        System.out.println("---");
        PrintMeMyHashMap.printKeysWhere(hashmap, "i");
        System.out.println("---");
        PrintMeMyHashMap.printValuesOfKeysWhere(hashmap, ".e");
    }

    private static void abbreviations() {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }

    private static void nicknames() {
        Map<String, String> nicks = new HashMap<>();

        nicks.put("matthew", "matt");
        nicks.put("michael", "mix");
        nicks.put("arthur", "artie");

        System.out.println("Matthew's nickname is " + nicks.get("matthew"));
    }
}
