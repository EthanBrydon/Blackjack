import java.util.ArrayList;
import java.util.HashMap;

public class Participator {
  private int score;
  private ArrayList<Character> cards;
  private HashMap<Character, Integer> cardValues;

  public Participator() {
    score = 0;
    cards = new ArrayList<Character>();
    cardValues = new HashMap<Character, Integer>();
    popCardValues();
  }

  private void popCardValues() {
    cardValues.put('2', 2);
    cardValues.put('3', 3);
    cardValues.put('4', 4);
    cardValues.put('5', 5);
    cardValues.put('6', 6);
    cardValues.put('7', 7);
    cardValues.put('8', 8);
    cardValues.put('9', 9);
    cardValues.put('T', 10);
    cardValues.put('J', 10);
    cardValues.put('Q', 10);
    cardValues.put('K', 10);
    cardValues.put('A', 11);
  }

  public boolean bust() {
    if (calculate() > 21) {
      System.out.println("Bust!");
      return true;
    }
    return false;
  }

  public void dealCard(char card) {
    this.getCards().add(card);
  }

  protected int calculate() {
    int total = 0;
    for (int i = 0; i < getCards().size(); i++) {
      total += cardValues.get(getCards().get(i));
    }
    if (total > 21) {
      for (int i = 0; i < countAces(); i++) {
        total -= 10;
        if (total < 21) {
          score = total;
          return total;
        }
      }
    }
    score = total;
    return total;
  }

  private int countAces() {
    int numAces = 0;
    for (int i = 0; i < getCards().size(); i++) {
      if (getCards().get(i) == 'A') {
        numAces++;
      }
    }
    return numAces;
  }

  protected ArrayList<Character> getCards() {
    return cards;
  }

  public void clearCards() {
    this.cards.clear();
  }

  public int getScore() {
    calculate();
    return score;
  }

}