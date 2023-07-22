package andfxx.p10.comparableinterface.literacycomparison;

public class RawLiteracyDatum implements Comparable<RawLiteracyDatum> {
    private final String theme;
    private final String ageGroup;
    private final String gender;
    private final String country;
    private final int year;
    private final double literacyRate;

    public RawLiteracyDatum(String theme, String ageGroup, String gender, String country, int year, double literacyRate) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyRate = literacyRate;
    }

    public String getTheme() {
        return theme;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public double getLiteracyRate() {
        return literacyRate;
    }

    @Override
    public int compareTo(RawLiteracyDatum o) {
        return Double.compare(this.literacyRate, o.literacyRate);
    }

    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + literacyRate;
    }
}
