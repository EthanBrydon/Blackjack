public class Dealer extends Participator {

  public Dealer() {
    super();
  }

  public boolean wantCard() {
    if (this.calculate() > 16) {
      return false;
    }
    return true;
  }

  public String cardsToString(int end) {
    String hand = "";
    if (end == 0) {
      return "[" + this.getCards().get(0) + "][?]";
    }
    for (int i = 0; i < getCards().size(); i++) {
      hand += "[" + this.getCards().get(i) + "]";
    }
    return hand;
  }
}