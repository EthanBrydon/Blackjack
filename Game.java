import java.util.*;

public class Game {
  private Dealer dealer;
  private Player player;
  private Deck deck;

  public Game(int decks) {
    dealer = new Dealer();
    player = new Player();
    deck = new Deck(decks);
  }

  public void runGame() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Cards being dealt...");
    player.dealCard(deck.takeCard());
    dealer.dealCard(deck.takeCard());
    player.dealCard(deck.takeCard());
    dealer.dealCard(deck.takeCard());

    System.out.println("Player's turn first.");
    String action = "h";
    boolean playerBusted = false;
    while (action.equals("h")) {
      System.out.println("Dealer has: " + dealer.cardsToString(0) + ".");
      System.out.println("Player has: " + player.cardsToString() + ".");
      System.out.println("Enter 'h' to Hit and 's' to Stand: ");
      action = sc.nextLine();
      if (action.equals("h")) {
        player.dealCard(deck.takeCard());
        playerBusted = player.bust();
        if (playerBusted) {
          break;
        }
      } else if (action.equals("s")) {
        break;
      } else {
        System.out.println("Enter a valid input!");
      }
    }

    if (!playerBusted) {
      System.out.println("Dealer's turn now.");
      while (dealer.wantCard()) {
        dealer.dealCard(deck.takeCard());
        if (dealer.bust()) {
          break;
        }
      }
    }

    System.out.println("Dealer has: " + dealer.cardsToString(1) + " with a score of " + dealer.getScore() + ".");
    System.out.println("Player has: " + player.cardsToString() + " with a score of " + player.getScore() + ".");
    if ((dealer.getScore() > player.getScore() && dealer.getScore() < 22)
        || (dealer.getScore() < player.getScore() && player.getScore() > 21)) {
      System.out.println("Dealer Wins!");
      player.addLoss();
    } else if (dealer.getScore() == player.getScore()) {
      System.out.println("It's a Tie!");
    } else {
      System.out.println("Player Wins!");
      player.addWin();
    }

    System.out.println("Player Stats: Wins - " + player.getWins() + " | Losses - " + player.getLosses() + ".");
    player.clearCards();
    dealer.clearCards();
  }
}