package p01_card_suit;

public class Card implements Comparable<Card>{
    private CardSuits cardSuit;
    private CardRanks cardRank;
    private int power;

    public Card(String cardSuit, String cardRank) {
        this.cardSuit = Enum.valueOf(CardSuits.class, cardSuit.toUpperCase());
        this.cardRank = Enum.valueOf(CardRanks.class, cardRank.toUpperCase());
        this.power = this.cardSuit.getValue() + this.cardRank.getValue();
    }

    public CardSuits getCardSuit() {
        return cardSuit;
    }

    public CardRanks getCardRank() {
        return cardRank;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.cardRank.name(), this.cardSuit.name(), this.getPower());
    }

    @Override
    public int compareTo(Card card) {
        return Integer.compare(this.getPower(), card.getPower());
    }
}
