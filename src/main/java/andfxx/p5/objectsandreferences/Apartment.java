package andfxx.p5.objectsandreferences;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int calculatePrice() {
        return squares * pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int thisApartmentPrice = calculatePrice();
        int comparedApartmentPrice = compared.calculatePrice();
        return Math.abs(thisApartmentPrice - comparedApartmentPrice);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return calculatePrice() > compared.calculatePrice();
    }
}
