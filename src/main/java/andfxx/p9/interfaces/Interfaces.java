package andfxx.p9.interfaces;

import andfxx.p9.interfaces.interfaceinabox.Book;
import andfxx.p9.interfaces.interfaceinabox.Box;
import andfxx.p9.interfaces.interfaceinabox.CD;
import andfxx.p9.interfaces.onlineshop.Store;
import andfxx.p9.interfaces.onlineshop.Warehouse;
import andfxx.p9.interfaces.tacoboxes.CustomTacoBox;
import andfxx.p9.interfaces.tacoboxes.TacoBox;
import andfxx.p9.interfaces.tacoboxes.TripleTacoBox;

import java.util.*;

public class Interfaces {
    public static void interfaces() {
        System.out.println("Hello world from andfxx.p9.interfaces");

        onlineShop();
    }

    private static void onlineShop() {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 10);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);
        store.shop("John");
    }

    private static void setAsAMethodParameter() {
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("second");

        System.out.println(returnSizeSet(names));
    }

    private static int returnSizeSet(Set<String> names) {
        return names.size();
    }

    private static void mapAsAMethodParameter() {
        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSizeMap(names));
    }

    private static int returnSizeMap(Map<String, String> names) {
        return names.size();
    }

    private static void listAsAMethodParameter() {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSizeList(names));
    }

    private static int returnSizeList(List<String> list) {
        return list.size();
    }

    private static void interfaceInABox() {
        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        box.add(box);

        System.out.println(box);
    }

    private static void tacoBoxes() {
        TacoBox tacoBox = new TripleTacoBox();
        System.out.println(tacoBox);

        tacoBox.eat();

        System.out.println(tacoBox);

        System.out.println();
        System.out.println("[---]");
        System.out.println();

        TacoBox customTacoBox = new CustomTacoBox(5);
        System.out.println(customTacoBox);

        customTacoBox.eat();

        System.out.println(customTacoBox);
    }
}
