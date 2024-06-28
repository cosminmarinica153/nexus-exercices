package CardGames.utils;

import java.util.ArrayList;

public record Player(String type, ArrayList<Card> cards) {
    public void addCards(ArrayList<Card> cards) {
        this.cards.addAll(cards);
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public int getCardsValue() {
        int total = 0;
        for(Card card : cards) {
            total = total + card.getValue();
        }
        return total;
    }

    public ArrayList<Card> getCards(boolean dealer) {
        Card hiddenCard = new Card( "?");
        ArrayList<Card> cards = new ArrayList<>(this.cards);
        if (dealer) {
            cards.removeLast();
            cards.addLast(hiddenCard);
        }
        return cards;
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
