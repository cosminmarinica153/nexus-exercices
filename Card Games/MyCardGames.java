import java.util.ArrayList;
import java.util.Collections;

public class MyCardGames {
    public static void main(String[] args) {
        WarCardGame warCardGame = new WarCardGame();
        warCardGame.play();
    }
}

class WarCardGame {
    // Cards
    private final ArrayList<Card> deck;
    private final ArrayList<Card> cardsOnTable;

    // Players
    private final Player player;
    private final Player ai;

    public WarCardGame() {
        this.deck = new ArrayList<>();
        this.cardsOnTable = new ArrayList<>();

        initializeDeck();
        shuffleDeck();

        this.player = new Player("Player", new ArrayList<>(this.deck.subList(0, this.deck.size() / 2)));
        this.ai = new Player("Computer", new ArrayList<>(this.deck.subList(this.deck.size() / 2, this.deck.size())));
    }

    private void initializeDeck() {
        String[] suits = {"♥️", "♠️", "♦️", "♣️"};
        for (String suit : suits) {
            for (int i = 2; i <= 14; i++) {
                this.deck.add(new Card(i, suit));
            }
        }
    }

    private void shuffleDeck() { Collections.shuffle(this.deck); }

    private void pickUp(Player player) {
        player.addCards(this.cardsOnTable);
        this.cardsOnTable.clear();
        System.out.println(player.type() + " picks up!");
    }

    private void handleWar(Player player, Player ai) {
        System.out.println("Let the war begin! ⚔️");

        // If a player cannot continue the war, they lose
        if (player.cards().size() < 4 || ai.cards().size() < 4) {
            if (player.cards().size() < 4) {
                System.out.println("Player does not have enough cards for war. Computer wins!");
            } else {
                System.out.println("Computer does not have enough cards for war. Player wins!");
            }
        }

        for (int i = 0; i < 4; i++) {
            this.cardsOnTable.add(player.putCardOnTable());
            this.cardsOnTable.add(ai.putCardOnTable());
        }

        if (!player.hasCards() || !ai.hasCards()) {
            return;
        }

        Card playerWarCard = player.putCardOnTable();
        Card aiWarCard = ai.putCardOnTable();

        this.cardsOnTable.add(playerWarCard);
        this.cardsOnTable.add(aiWarCard);

        assert playerWarCard != null;
        assert aiWarCard != null;
        if (playerWarCard.getValue() > aiWarCard.getValue()) {
            pickUp(player);
        } else if (aiWarCard.getValue() > playerWarCard.getValue()) {
            pickUp(ai);
        } else {
            handleWar(player, ai); // Continue war if still tied
        }
    }

    public void play() {
        while (this.player.hasCards() && this.ai.hasCards()) {

            Card lastPlayerCard = this.player.putCardOnTable();
            Card lastAiCard = this.ai.putCardOnTable();

            this.cardsOnTable.add(lastPlayerCard);
            this.cardsOnTable.add(lastAiCard);

            assert lastPlayerCard != null;
            assert lastAiCard != null;
            if (lastPlayerCard.getValue() > lastAiCard.getValue()) {
                pickUp(this.player);
            } else if (lastAiCard.getValue() > lastPlayerCard.getValue()) {
                pickUp(this.ai);
            } else {
                handleWar(this.player, this.ai);
            }
        }

        if (this.player.cards().isEmpty()) {
            System.out.println("Computer wins!");
        } else if (this.ai.cards().isEmpty()) {
            System.out.println("Player wins");
        }
    }
}

class Card {
    private final int value; // 2 - 14
    private final String suit; // Trefla, Inima etc

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() { return this.value; }

    public String toString() { return this.value + " " + this.suit; }
}

record Player(String type, ArrayList<Card> cards) {

    public void addCards(ArrayList<Card> cards) {
        this.cards.addAll(cards);
    }

    public Card putCardOnTable() {
        if (this.cards.isEmpty())
            return null;
        Card currCard = this.cards.getFirst();
        System.out.println(this.type + " puts down: " + currCard);
        this.cards.removeFirst();
        return currCard;
    }

    public boolean hasCards() {
        return !this.cards.isEmpty();
    }
}
