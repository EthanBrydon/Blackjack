import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  private ArrayList<Character> cards;
  private int decks;

  public Deck(int d) {
    cards = new ArrayList<>();
    decks = d;
    shuffle(decks);
  }

  private void popCards(int numDecks) {
    for (int h = 0; h < numDecks; h++) {
      for (int j = 0; j < 4; j++) {
        cards.add('2');
        cards.add('3');
        cards.add('4');
        cards.add('5');
        cards.add('6');
        cards.add('7');
        cards.add('8');
        cards.add('9');
        cards.add('T');
        cards.add('J');
        cards.add('Q');
        cards.add('K');
        cards.add('A');
      }
    }
  }

  protected void shuffle(int decks) {
    System.out.println("** Deck is being shuffled **");
    this.getCards().clear();
    popCards(decks);
    Collections.shuffle(this.getCards());
  }

  public char takeCard() {
    if (this.getCards().size() == 0) {
      shuffle(decks);
    }
    return this.getCards().remove(0);
  }

  public ArrayList<Character> getCards() {
    return cards;
  }

}