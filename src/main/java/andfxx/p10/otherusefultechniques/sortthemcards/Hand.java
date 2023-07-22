package andfxx.p10.otherusefultechniques.sortthemcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private final List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        if (!this.cards.contains(card)) {
            this.cards.add(card);
        }
    }

    public void print() {
        this.cards.forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    public void sortBySuit() {
        this.cards.sort(new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand o) {
        return this.cards.stream().mapToInt(Card::getValue).sum() - o.cards.stream().mapToInt(Card::getValue).sum();
    }
}
