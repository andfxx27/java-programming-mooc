package andfxx.p12.arraylistandhashtable.myhashmap;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K, V> {
    // Add; Get; Remove

    // To keep track of the actual key,value pairs list
    private List<Pair<K, V>>[] values;

    // To keep track of current count of key,value pairs list
    private int firstFreeIndex;

    public MyHashMap() {
        this.values = new ArrayList[32];
        this.firstFreeIndex = 0;
    }

    private List<Pair<K, V>> getKeyValuePairsListByKey(K key) {
        int hashValue = key.hashCode() % this.values.length;
        List<Pair<K, V>> keyValuePairs = this.values[hashValue];
        if (keyValuePairs == null) {
            this.values[hashValue] = new ArrayList<>();
        }

        return this.values[hashValue];
    }

    public void addPair(K key, V value) {
        // Find key,value pairs from values with same hashValue
        List<Pair<K, V>> keyValuePairs = getKeyValuePairsListByKey(key);

        // Iterate through the key,value pairs and find pair with same key
        int index = -1;
        for (int i = 0; i < keyValuePairs.size(); i++) {
            if (keyValuePairs.get(i).getKey().equals(key)) {
                index = i;
            }
        }

        // Insert new pair or update the value depending on the value of index
        if (index < 0) {
            keyValuePairs.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            keyValuePairs.get(index).setValue(value);
        }
    }

    public V get(K key) {
        // Find key,value pairs from values with same hashValue
        List<Pair<K, V>> keyValuePairs = getKeyValuePairsListByKey(key);

        for (Pair<K, V> keyValuePair : keyValuePairs) {
            if (keyValuePair.getKey().equals(key)) {
                return keyValuePair.getValue();
            }
        }

        return null;
    }

    public void remove(K key) {
        // Find key,value pairs from values with same hashValue
        List<Pair<K, V>> keyValuePairs = getKeyValuePairsListByKey(key);
        if (keyValuePairs.isEmpty()) {
            return;
        }

        int index = -1;
        for (int i = 0; i < keyValuePairs.size(); i++) {
            if (keyValuePairs.get(i).getKey().equals(key)) {
                index = i;
            }
        }

        if (index < 0) {
            return;
        }

        keyValuePairs.remove(keyValuePairs.get(index));
    }
}
