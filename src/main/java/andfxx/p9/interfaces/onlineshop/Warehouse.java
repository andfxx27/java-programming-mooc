package andfxx.p9.interfaces.onlineshop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private final Map<String, Integer> products;
    private final Map<String, Integer> productStockBalance;

    public Warehouse() {
        products = new HashMap<>();
        productStockBalance = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        productStockBalance.put(product, stock);
    }

    public int price(String product) {
        return products.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return productStockBalance.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        int stock = stock(product);
        stock--;
        if (stock < 0) {
            return false;
        }

        productStockBalance.put(product, stock);
        return true;
    }

    public Set<String> products() {
        return products.keySet();
    }
}
