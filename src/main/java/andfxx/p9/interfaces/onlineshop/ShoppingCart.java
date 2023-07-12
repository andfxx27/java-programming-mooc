package andfxx.p9.interfaces.onlineshop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private final Map<String, Item> products;

    public ShoppingCart() {
        products = new HashMap<>();
    }

    public void add(String product, int price) {
        if (products.containsKey(product)) {
            Item item = products.get(product);
            item.increaseQuantity();
            products.put(product, item);

            return;
        }

        products.put(product, new Item(product, 1, price));
    }

    public int price() {
        int totalPrice = 0;
        for (Item item : products.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : products.values()) {
            System.out.println(item);
        }
    }
}
