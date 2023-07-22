package andfxx.p10.otherusefultechniques.sortthemcards;

public class Card implements Comparable<Card> {
    private final int value;
    private final Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return switch (this.value) {
            case 11 -> suit.name() + " J";
            case 12 -> suit.name() + " Q";
            case 13 -> suit.name() + " K";
            case 14 -> suit.name() + " A";
            default -> suit.name() + " " + value;
        };
    }

    @Override
    public int compareTo(Card o) {
        if (this.value == o.value) {
            return this.suit.compareTo(o.suit);
        }

        return this.value - o.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Card card)) {
            return false;
        }

        return this.value == card.value && this.suit == card.suit;
    }
}
