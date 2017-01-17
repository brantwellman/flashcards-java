import java.util.*;

class Deck {
  private List<Card> cards;

  public Deck(List<Card> cards) {
    this.cards = cards;
  }

  public List<Card> getCards() {
    return cards;
  }

  public List<Card> addCard(Card card) {
    cards.add(card);
    return cards;
  }

  public int count() {
    return cards.size();
  }
}
