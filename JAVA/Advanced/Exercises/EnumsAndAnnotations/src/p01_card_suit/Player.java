package p01_card_suit;

import java.util.ArrayList;
import java.util.List;

public class Player implements Comparable<Player>{
    private String name;
    private List<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getSumPower() {
        int result = 0;
        for (Card card : this.cards) {
            result += card.getPower();
        }
        return result;
    }

    public Card getWinningCard() {
        int max = 0;
        Card card = null;
        for (Card card1 : cards) {
            if (card1.getPower() > max) {
                card = card1;
                max = card1.getPower();
            }
        }
        return card;
    }

    @Override
    public int compareTo(Player player1) {
        return Integer.compare(this.getSumPower(), player1.getSumPower());
    }
}
