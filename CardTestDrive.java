import java.util.*;

class CardTestDrive {
  public static void main(String[] args) {
    System.out.println("<<-- Iteration 1 -->>");
    Card one = new Card("What is the capital of Alaska?", "Juneau");
    System.out.println(one.getQuestion());
    System.out.println(one.getAnswer());

    System.out.println("<<-- Iteration 2 -->>");
    Guess guess_1 = new Guess("Juneau", one);
    System.out.println(guess_1.getCard());
    System.out.println(guess_1.getResponse());
    System.out.println(guess_1.correct());
    System.out.println(guess_1.feedback());
    Card two = new Card("Which planet is closest to the sun?", "Mercury");
    Guess guess_2 = new Guess("Saturn", two);
    System.out.println(guess_2.getCard());
    System.out.println(guess_2.getResponse());
    System.out.println(guess_2.correct());
    System.out.println(guess_2.feedback());

    System.out.println("<<-- Iteration 3 -->>");
    Card three = new Card("Which state will I be traveling too?", "Alaska");
    Deck deck_1 = new Deck(new ArrayList<>());
    deck_1.addCard(one);
    deck_1.addCard(two);
    deck_1.addCard(three);
    System.out.println(deck_1.getCards());
    System.out.println(deck_1.count());

    System.out.println("<<-- Iteration 4 -->>");
    Round round = new Round(deck_1);
    System.out.println(round.getDeck());
    System.out.println(round.getGuesses());
    System.out.println(round.currentCard().getQuestion());
    round.recordGuess("Juneau");
    System.out.println(round.getGuesses().size());
    System.out.println(round.getGuesses().get(0).feedback());
    System.out.println(round.getNumberCorrect());
    System.out.println(round.currentCard().getQuestion());
    round.recordGuess("Saturn");
    System.out.println(round.getGuesses().size());
    System.out.println(round.getGuesses().get(round.getGuesses().size() - 1).feedback());
    System.out.println(round.getNumberCorrect());
    System.out.println(round.percentCorrect());
  }
}
