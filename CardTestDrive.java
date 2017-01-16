class CardTestDrive {
  public static void main(String[] args) {
    Card one = new Card("What is the capital of Alaska?", "Juneau");
    System.out.println(one.getQuestion());
    System.out.println(one.getAnswer());

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
  }
}
