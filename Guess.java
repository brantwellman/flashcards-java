class Guess {
  private final Card card;
  private final String response;

  public Guess(String response, Card card) {
    this.response = response;
    this.card = card;
  }

  public Card getCard() {
    return card;
  }

  public String getResponse() {
    return response;
  }

  public boolean correct() {
    return response.equals(card.getAnswer());
  }

  public String feedback() {
    return correct() ? "Correct" : "Incorrect";
  }
}
