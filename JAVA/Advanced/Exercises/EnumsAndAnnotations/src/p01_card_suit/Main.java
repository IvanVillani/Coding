package p01_card_suit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        List<Card> usedCards = new ArrayList<>();

        Player player1 = new Player(reader.readLine());
        Player player2 = new Player(reader.readLine());

        while(true) {
            String[] arr = reader.readLine().split(" ");
            if (arr[0].equals(arr[0].toUpperCase()) && arr[2].equals(arr[2].toUpperCase())) {
                Card card = new Card(arr[2], arr[0]);
                boolean isPresentInUsed = false;
                for (Card usedCard : usedCards) {
                    if (card.getCardSuit().name().equals(usedCard.getCardSuit().name()) &&
                            card.getCardRank().name().equals(usedCard.getCardRank().name())) {
                        System.out.println("Card is not in the deck.");
                        isPresentInUsed = true;
                    }
                }
                if (!isPresentInUsed) {
                    if (player1.getCards().size() < 5) {
                        player1.getCards().add(card);
                    }else {
                        player2.getCards().add(card);
                    }
                    usedCards.add(card);
                }
            }else {
                System.out.println("No such card exists.");
            }
            if (player2.getCards().size() == 5) {
                break;
            }

        }

        if (player1.compareTo(player2) <= 0) {
            System.out.printf("%s wins with %s of %s.%n", player1.getName(), player1.getWinningCard().getCardRank().name(),
                    player1.getWinningCard().getCardSuit().name());
        }else {
            System.out.printf("%s wins with %s of %s.%n", player2.getName(), player2.getWinningCard().getCardRank().name(),
                    player2.getWinningCard().getCardSuit().name());
        }
    }
}
