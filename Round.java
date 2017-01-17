import java.util.*;

class Round {
  private Deck deck;
  private List<Guess> guesses = new ArrayList<Guess>();
  private int numberCorrect = 0;

  public Round(Deck deck) {
    this.deck = deck;
  }

  public Deck getDeck() {
    return deck;
  }

  public List<Guess> getGuesses() {
    return guesses;
  }

  public int getNumberCorrect() {
    return numberCorrect;
  }

  public Card currentCard() {
    return deck.getCards().get(0);
  }

  public void recordGuess(String guess) {
    Guess currentGuess = new Guess(guess, currentCard());
    guesses.add(currentGuess);
    if (guess.equals(currentCard().getAnswer())) { numberCorrect++; }
    updateDeck();
  }

  public void updateDeck() {
    deck.getCards().remove(0);
  }

  public int percentCorrect() {
    float x = ((float) numberCorrect / guesses.size() * 100);
    return Math.round(x);
  }

}
