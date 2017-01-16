class CardTestDrive {
  public static void main(String[] args) {
    Card one = new Card();
    one.setQuestion("What is the capital of Alaska?");
    one.setAnswer("Juneau");
    System.out.println(one.getQuestion());
    System.out.println(one.getAnswer());
  }
}
