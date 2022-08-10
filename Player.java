public class Player extends Participator {
  private int wins;
  private int losses;

  public Player() {
    super();
    wins = 0;
    losses = 0;
  }

  public int addWin() {
    return wins++;
  }

  public int getWins() {
    return wins;
  }

  public int addLoss() {
    return losses++;
  }

  public int getLosses() {
    return losses;
  }

  public String cardsToString() {
    String hand = "";
    for (int i = 0; i < this.getCards().size(); i++) {
      hand += "[" + this.getCards().get(i) + "]";
    }
    return hand;
  }

}
