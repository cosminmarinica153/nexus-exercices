package CardGames;

import CardGames.utils.Card;
import CardGames.utils.Deck;
import CardGames.utils.Player;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class BlackJack {
    //  Cards
    private final ArrayList<Card> playerCards;
    private final ArrayList<Card> dealerCards;

    // Totals
    private int playerTotal;
    private int dealerTotal;
    private int dealerDisplayTotal;

    // Players
    private final Player dealer;
    private final Player player;

    // Init
    public BlackJack() {
        //  Cards
        Deck deck = new Deck(1, 11);
        ArrayList<Card> cards = deck.getDeck();

        this.dealerCards = new ArrayList<>();
        this.playerCards = new ArrayList<>();

        this.dealer = new Player("Dealer", dealerCards);
        this.player = new Player("Player", playerCards);

        deal(cards);
    }

    private void deal(ArrayList<Card> cards) {
        for (int i = 0; i < 2; i++) {
            this.dealer.addCard(cards.getFirst());
            cards.remove(cards.getFirst());

            this.player.addCard(cards.getFirst());
            cards.remove(cards.getFirst());
        }

        for (Card playerCard : playerCards) {
            this.playerTotal = this.playerTotal + playerCard.getValue();
        }

        for (Card dealerCard : dealerCards) {
            this.dealerTotal = this.dealerTotal + dealerCard.getValue();
        }

        for (int i = 0; i < dealerCards.size() - 1; i++) {
            this.dealerDisplayTotal = this.dealerDisplayTotal + dealerCards.get(i).getValue();
        }

        displayCards(this.dealer);
        displayCards(this.player);

    }

    private void checkForAces(ArrayList<Card> cards, Player player) {
        for (Card card : cards) {
            if(player.getCardsValue() > 21) {
                // Check if player has any card with the value of 11, if so remove it and replace it with a card with
                // the value of 1, after that remove that card from the deck
//                if (player.getCards().contains(Card()));
            }
        }
    }

    private void displayCards(Player player) {
        boolean isDealer = Objects.equals(player.type(), "Dealer");
        String totalOutput = Objects.equals(player.type(), "Dealer") ?
                this.dealerDisplayTotal + " (" + this.dealerTotal + ")" :
                String.valueOf(this.playerTotal);
        System.out.println(player.type() + ": " + player.getCards(isDealer) + ". Total: " + totalOutput);
    }


    private void hit(ArrayList<Card> cards, Player playerToHit) {
        playerToHit.addCard(cards.getFirst());
        checkForAces(cards, playerToHit);
        displayCards(playerToHit);
    }

    private int checkPlayerChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your choice?");
        System.out.println("1. Hit");
        System.out.println("2. Stand");
        return scanner.nextInt() == 1 || scanner.nextInt() == 2 ? scanner.nextInt() : 0;
    }

}
