package andfxx.p12.arraylistandhashtable.mylist;

import java.util.Arrays;

public class MyList<T> {
    // Add; Contains; Remove; Get

    // Array to hold the actual list values
    private T[] values;

    // Int variable to keep track of first free index which can be inserted with value
    private int firstFreeIndex;

    public MyList() {
        this.values = (T[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void addValue(T value) {
        // Increase array size if the actual array with value (first free index) is equal to the array value
        if (this.values.length == this.firstFreeIndex) {
            grow();
        }

        this.values[firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    public void grow() {
        // Create new array twice the size of old array
        int newSize = this.values.length * 2;
        T[] newValues = (T[]) new Object[newSize];

        // Copy all values from old array to new array
        for (int i = 0; i < firstFreeIndex; i++) {
            newValues[i] = this.values[i];
        }

        // Re-assign values with the expanded array
        this.values = newValues;
    }

    public boolean contains(T value) {
        return this.indexOf(value) >= 0;
    }

    public void remove(T value) {
        int valueToBeRemovedIndex = this.indexOf(value);
        if (valueToBeRemovedIndex < 0) {
            throw new IllegalArgumentException("Invalid value to remove.");
        }

        for (int i = valueToBeRemovedIndex; i < firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }

    private int indexOf(T value) {
        for (int i = 0; i < firstFreeIndex; i++) {
            if (this.values[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public T get(int index) {
        if (index < 0 || index > firstFreeIndex - 1) {
            throw new ArrayIndexOutOfBoundsException("Index is invalid.");
        }

        return this.values[index];
    }

    public T[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.values);
    }
}
