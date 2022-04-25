package org.example.core;

import java.util.ArrayList;

public class Deck implements Suite {
    public ArrayList<Card> deck = new ArrayList<Card>();

    public Deck() {
        for (int i = 1; i <= 13; i++) {
            deck.add(new Card(i, CLUBS));
            deck.add(new Card(i, DIAMONDS));
            deck.add(new Card(i, HEARTS));
            deck.add(new Card(i, SPADE));
        }
    }

    public Card dealCard() {
        int rand = (int) (Math.random() * ((deck.size() - 1)));
        Card c = deck.get(rand);
        deck.remove(c);
        return c;
    }
}
