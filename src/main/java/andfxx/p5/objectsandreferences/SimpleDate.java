package andfxx.p5.objectsandreferences;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Advance day by 1, while also adjusting the day, month, and year accordingly
    public void advance() {
        day++;
        if (day > 30) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public void advance(int howManyDays) {
        for (int i = 0; i < howManyDays; i++) {
            advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate simpleDate = new SimpleDate(day, month, year);

        simpleDate.advance(days);

        return simpleDate;
    }

    // Even though year, month, and day are private, a private variable can be accessed from all the methods contained by that class
    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year > compared.year) {
            return false;
        }

        if (this.month < compared.month) {
            return true;
        }

        if (this.month > compared.month) {
            return false;
        }

        return this.day < compared.day;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SimpleDate comparedSimpleDate)) {
            return false;
        }

        return this.day == comparedSimpleDate.day && this.month == comparedSimpleDate.month && this.year == comparedSimpleDate.year;
    }

    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }
}
