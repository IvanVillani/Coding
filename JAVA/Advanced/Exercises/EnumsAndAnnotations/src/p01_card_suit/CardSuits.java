package p01_card_suit;

@MyAnnotation(category = "Suit", description = "Provides suit constants for a Card class.")
public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int value;

    CardSuits(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
