package andfxx.p8.similarityofobjects;

import java.util.Objects;

public class SimpleDate {
    private final int day;
    private final int month;
    private final int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SimpleDate simpleDate)) {
            return false;
        }

        return this.day == simpleDate.day && this.month == simpleDate.month && this.year == simpleDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
